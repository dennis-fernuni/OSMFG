
PARSER_BEGIN(SyntaxChecker)

public class SyntaxChecker {
    public static void main(String[] args) {
        try {
            new SyntaxChecker(new java.io.StringReader(args[0])).S();
            System.out.println("Syntax is okay");
        } catch (Throwable e) {
            // Catching Throwable is ugly but JavaCC throws Error objects!
            System.out.println("Syntax check failed: " + e.getMessage());
        }
    }
}

PARSER_END(SyntaxChecker)

SKIP:  { "\t" | "\n" | "\r"                    }
TOKEN: { "(" | ")" | "+" | "*" | <NUM: (["0"-"9"])+> }
 

void S(): {} { NODE() <EOF>           }

void XML() : {}{ "<?xml version='1.0' encoding='UTF-8'?>" "<osm version=" "\"" "0.6" "\"" " generator=" "\"" "Osmosis SNAPSHOT-r26564" "\"" ">" NODE() "</osm>" } 
void NODE() : {}{ "<node " STRING ">" TAG() "</node>" } 
void TAG() : {}{ ( SPACE() )* "<tag " TEXT() "/>" ( SPACE() )* } 
void DIGIT() : {}{ "0" | NONZERODIGIT() } 
void TIMESTAMP() : {}{ YEAR() "-" DIGIT() DIGIT()  "-" DIGIT() DIGIT() "T:" DIGIT() DIGIT() ":" DIGIT() DIGIT() ":" DIGIT() DIGIT() "." NUMBER() TZD() } 
void NUMBER() : {}{ NONZERODIGIT() ( DIGIT() )* } 
void BOOLEAN() : {}{ "true" | "false" } 
void SPACE() : {}{ " " } 
void TEXT() : {}{ ( "A..Z" | "a..z" | DIGIT() | SPACE() )* } 
void YEAR() : {}{ DIGIT() DIGIT() DIGIT() DIGIT() } 
void TZD() : {}{ "Z" | ( "+" | "-" ) DIGIT() DIGIT() ":" DIGIT() DIGIT() } 
void NONZERODIGIT() : {}{ "1..9" } 
void NODE__ermergency_fire_hydrant() : {}{ "emergency=fire_hydrant" [ "fire_hydrant:type=" fire_hydrant_type() ] [ "fire_hydrant:diameter=" fire_hydrant_diameter() ] [ "fire_hydrant:preasure=" fire_hydrant_preasure() ] [ "fire_hydrant:position=" fire_hydrant_position() ] [ fire_hydrant_count() ] } 
void fire_hydrant_type() : {}{ "underground" | "pillar" | "wall" | "pond" } 
void fire_hydrant_diameter() : {}{ "fire_hydrant:type=" NUMBER() } 
void fire_hydrant_preasure() : {}{ "fire_hydrant:preasure=" NUMBER() } 
void fire_hydrant_position() : {}{ "lane" | "parking_lot" | "sidewalk" | "green" } 
void fire_hydrant_count() : {}{ "fire_hydrant_count=" NUMBER() } 
void NODE__traffic_signals() : {}{ "highway=traffic_signals" [ "traffic_signals:sound=" traffic_signals_sound() ] [ "traffic_signals:vibration=" traffic_signals_vibration() ] } 
void traffic_signals_sound() : {}{ "locate" | "walk" | "yes" | "no" } 
void traffic_signals_vibration() : {}{ "yes" | "no" } 
