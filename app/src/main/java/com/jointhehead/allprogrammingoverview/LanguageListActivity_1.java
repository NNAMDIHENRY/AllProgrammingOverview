package com.jointhehead.allprogrammingoverview;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;


import java.util.ArrayList;
import java.util.Arrays;

public class LanguageListActivity_1 extends AppCompatActivity {
ListView languageListView;
ArrayList<String> languageListArrayList;
Resources resources;
BottomNavigationView bottomNavigationView;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_list1);
        setTitle("Languages");


        bottomNavigationView=(BottomNavigationView) findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.languages);
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                 intent = new Intent(getApplicationContext(),MakeMoneyActivity.class);
                switch(menuItem.getItemId()){
                    case R.id.makeMoney:
                        intent = new Intent(getApplicationContext(),MakeMoneyActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.home:
                        intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                        break;
                }
                Toast.makeText(getApplicationContext(), "the navigation view is already working", Toast.LENGTH_SHORT).show();
                return true;
            }
        });


        LanguageListActivity_1 languageListActivity_1=new LanguageListActivity_1();
        languageListView=(ListView)findViewById(R.id.languageListView);
  languageListArrayList=new ArrayList<>();
  resources=getResources();
  String[] programmingLanguageString=resources.getStringArray(R.array.programmingLanguagesArray);
        languageListArrayList.addAll(Arrays.asList(programmingLanguageString));
  //languageListActivity_1.addLanguage(languageListArrayList);
        ArrayAdapter<String> languageListArrayAdapter=new ArrayAdapter<>(this, android.R.layout.select_dialog_item,languageListArrayList);
languageListView.setAdapter(languageListArrayAdapter);

//here we handle event when the languages are clicked.
languageListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
public void onItemClick(AdapterView<?> parent, View view,int position,long id){
   String languageNames=languageListView.getItemAtPosition(position).toString();

    switch(languageNames){


        case "C":
            intent=new Intent(getApplicationContext(),C_LanguageActivity.class);
            startActivity(intent);
            break;
        case "Java":
            intent=new Intent(getApplicationContext(),JavaLanguageActivity.class);
            startActivity(intent);
            break;
        case "Python":
            intent=new Intent(getApplicationContext(),PythonLanguageActivity.class);
            startActivity(intent);
            break;
        case "C++":
            intent=new Intent(getApplicationContext(),C_PLUSPLUSLanguageActivity.class);
            startActivity(intent);
            break;
        case "C#":
            intent=new Intent(getApplicationContext(),C_HASHLanguageActivity.class);
            startActivity(intent);
            break;
        case "JavaScript":
            intent=new Intent(getApplicationContext(),JavaScriptLanguageActivity.class);
            startActivity(intent);
            break;
        case "PHP":
            intent=new Intent(getApplicationContext(),PHPLanguageActivity.class);
            startActivity(intent);
            break;
        case "VB.NET":
            intent=new Intent(getApplicationContext(),VB_DOT_NETLanguageActivity.class);
            startActivity(intent);
            break;
        case "R":
            intent=new Intent(getApplicationContext(),R_LanguageActivity.class);
            startActivity(intent);
            break;
        case "SQL":
            intent=new Intent(getApplicationContext(),SQLLanguageActivity.class);
            startActivity(intent);
            break;
        case "GO":
            intent=new Intent(getApplicationContext(),GO_LanguageActivity.class);
            startActivity(intent);
            break;
        case "Swift":
            intent=new Intent(getApplicationContext(),SwiftLanguageActivity.class);
            startActivity(intent);
            break;
        case "Perl":
            intent=new Intent(getApplicationContext(),PerlLanguageActivity.class);
            startActivity(intent);
            break;
        case "Assembly Language":
            intent=new Intent(getApplicationContext(),AssemblyLanguageActivity.class);
            startActivity(intent);
            break;
        case "Ruby":
            intent=new Intent(getApplicationContext(),RubyLanguageActivity.class);
            startActivity(intent);
            break;
        case "MATLAB":
            intent=new Intent(getApplicationContext(),MATLABLanguageActivity.class);
            startActivity(intent);
            break;
        case "Classic Visual Basic":
            intent=new Intent(getApplicationContext(),ClassicVisualBasicLanguageActivity.class);
            startActivity(intent);
            break;
        case "Apache Groovy":
            intent=new Intent(getApplicationContext(),ApacheGroovyLanguageActivity.class);
            startActivity(intent);
            break;
        case "Object-C":
            intent=new Intent(getApplicationContext(),ObjectCLanguageActivity.class);
            startActivity(intent);
            break;
        case "Rust":
            intent=new Intent(getApplicationContext(),RustLanguageActivity.class);
            startActivity(intent);
            break;
        case "SAS":
            intent=new Intent(getApplicationContext(),SAS_LanguageActivity.class);
            startActivity(intent);
            break;
        case "Scratch":
            intent=new Intent(getApplicationContext(),ScratchLanguageActivity.class);
            startActivity(intent);
            break;
        case "D":
            intent=new Intent(getApplicationContext(),D_LanguageActivity.class);
            startActivity(intent);
            break;
        case "Dart":
            intent=new Intent(getApplicationContext(),DartLanguageActivity.class);
            startActivity(intent);
            break;
        case "PL/SQL":
            intent=new Intent(getApplicationContext(),PL_SQL_LanguageActivity.class);
            startActivity(intent);
            break;
        case "Logo":
            intent=new Intent(getApplicationContext(),LogoLanguageActivity.class);
            startActivity(intent);
            break;
        case "Delphi":
            intent=new Intent(getApplicationContext(),DelphiLanguageActivity.class);
            startActivity(intent);
            break;
        case "Cobol":
            intent=new Intent(getApplicationContext(),CobolLanguageActivity.class);
            startActivity(intent);
            break;
        case "Kotlin":
            intent=new Intent(getApplicationContext(),KotlinLanguageActivity.class);
            startActivity(intent);
            break;
        case "OpenEdge ABL":
            intent=new Intent(getApplicationContext(),OpenEdgeABLLanguageActivity.class);
            startActivity(intent);
            break;
        case "Julia":
            intent=new Intent(getApplicationContext(),JuliaLanguageActivity.class);
            startActivity(intent);
            break;
        case "ABAP":
            intent=new Intent(getApplicationContext(),ABAPLanguageAcitvity.class);
            startActivity(intent);
            break;
        case "Scala":
            intent=new Intent(getApplicationContext(),ScalaLanguageActivity.class);
            startActivity(intent);
            break;
        case "Transact-SQL":
            intent=new Intent(getApplicationContext(),TransactSQLLanguageActivity.class);
            startActivity(intent);
            break;
        case "Scheme":
            intent=new Intent(getApplicationContext(),SchemeLanguageActivity.class);
            startActivity(intent);
            break;
        case "Ada":
            intent=new Intent(getApplicationContext(),PrologLanguageActivity.class);
            startActivity(intent);
            break;
        case "Lisp":
            intent=new Intent(getApplicationContext(),AdaLanguageActivity.class);
            startActivity(intent);
            break;
        case "Apex":
            intent=new Intent(getApplicationContext(),LispLanguageActivity.class);
            startActivity(intent);
            break;
        case "Lua":
            intent=new Intent(getApplicationContext(),ApexLanguageActivity.class);
            startActivity(intent);
            break;
        case "Fortran":
            intent=new Intent(getApplicationContext(),FortranLanguageActivity.class);
            startActivity(intent);
            break;
        case "Haskell":
            intent=new Intent(getApplicationContext(),HaskellLanguageActivity.class);
            startActivity(intent);
            break;
        case "Hack":
            intent=new Intent(getApplicationContext(),HackLanguageActivity.class);
            startActivity(intent);
            break;
        case "VBScript":
            intent=new Intent(getApplicationContext(),VBScriptLanguageActivity.class);
            startActivity(intent);
            break;
        case "Visual FoxPro":
            intent=new Intent(getApplicationContext(),VisualFoxPro.class);
            startActivity(intent);
            break;
        case "TypeScript":
            intent=new Intent(getApplicationContext(),TypeScriptLanguageActivity.class);
            startActivity(intent);
            break;
        case "AWK":
            intent=new Intent(getApplicationContext(),AWKLanguageActivity.class);
            startActivity(intent);
            break;
        case "ActionScript":
            intent=new Intent(getApplicationContext(),ActionScriptLanguageActivity.class);
            startActivity(intent);
            break;
        case "Tcl":
            intent=new Intent(getApplicationContext(),TclLanguageActivity.class);
            startActivity(intent);
            break;
        case "Smalltalk":
            intent=new Intent(getApplicationContext(),SmallTalkLanguageActivity.class);
            startActivity(intent);
            break;
        case "ABC":
            intent=new Intent(getApplicationContext(),ABCLanguageActivity.class);
            startActivity(intent);
            break;
        case "Alice":
            intent=new Intent(getApplicationContext(),AliceLanguageActivity.class);
            startActivity(intent);
            break;
        case "APL":
            intent=new Intent(getApplicationContext(),APLLanguageActivity.class);
            startActivity(intent);
            break;
        case "AutoLisp":
            intent=new Intent(getApplicationContext(),AutoLispLanguageActivity.class);
            startActivity(intent);
            break;
        case "Bash":
            intent=new Intent(getApplicationContext(),BashLanguageActivity.class);
            startActivity(intent);
            break;
        case "bc":
            intent=new Intent(getApplicationContext(),bcLanguageActivity.class);
            startActivity(intent);
            break;
        case "BourneShell":
            intent=new Intent(getApplicationContext(),BourneShellLanguageActivity.class);
            startActivity(intent);
            break;
        case "CShell":
            intent=new Intent(getApplicationContext(),CShellLanguageActivity.class);
            startActivity(intent);
            break;
        case "Clipper":
            intent=new Intent(getApplicationContext(),ClipperLanguageActivity.class);
            startActivity(intent);
            break;
        case "Cloujure":
            intent=new Intent(getApplicationContext(),CloujureLanguageActivity.class);
            startActivity(intent);
            break;
        case "CoffeeSCRIPT":
            intent=new Intent(getApplicationContext(),CoffeeSCRIPTLanguageActivity.class);
            startActivity(intent);
            break;
        case "CommonLisp":
            intent=new Intent(getApplicationContext(),CommonLispLanguageActivity.class);
            startActivity(intent);
            break;
        case "Crystal":
            intent=new Intent(getApplicationContext(),CrystalLanguageActivity.class);
            startActivity(intent);
            break;
        case "CT":
            intent=new Intent(getApplicationContext(),CTLanguageActivity.class);
            startActivity(intent);
            break;
        case "Elixir":
            intent=new Intent(getApplicationContext(),ElixirLanguageActivity.class);
            startActivity(intent);
            break;
        case "EmacsLisp":
            intent=new Intent(getApplicationContext(),EmacsLispLanguageActivity.class);
            startActivity(intent);
            break;
        case "Erlang":
            intent=new Intent(getApplicationContext(),ErlangLanguageActivity.class);
            startActivity(intent);
            break;
        case "Euphorial":
            intent=new Intent(getApplicationContext(),EuphorialLanguageActivity.class);
            startActivity(intent);
            break;
        case "F#":
            intent=new Intent(getApplicationContext(),FHASHLanguageActivity.class);
            startActivity(intent);
            break;
        case "Forth":
            intent=new Intent(getApplicationContext(),ForthLanguageActivity.class);
            startActivity(intent);
            break;
        case "Genie":
            intent=new Intent(getApplicationContext(),GenieLanguageActivity.class);
            startActivity(intent);
            break;
        case "Icon":
            intent=new Intent(getApplicationContext(),IconLanguageActivity.class);
            startActivity(intent);
            break;
        case "IDL":
            intent=new Intent(getApplicationContext(),IDLLanguageActivity.class);
            startActivity(intent);
            break;
        case "Inform":
            intent=new Intent(getApplicationContext(),InformLanguageActivity.class);
            startActivity(intent);
            break;
        case "Io":
            intent=new Intent(getApplicationContext(),IoLanguageActivity.class);
            startActivity(intent);
            break;
        case "Korn Shell":
            intent=new Intent(getApplicationContext(),KornShellLanguageActivity.class);
            startActivity(intent);
            break;
        case "LabVIEW":
            intent=new Intent(getApplicationContext(),LabVIEWLanguageActivity.class);
            startActivity(intent);
            break;
        case "Ladder Logic":
            intent=new Intent(getApplicationContext(),LadderLogicLanguageActivity.class);
            startActivity(intent);
            break;
        case "LiveCode":
            intent=new Intent(getApplicationContext(),LiveCodeLanguageActivity.class);
            startActivity(intent);
            break;
        case "Maple":
            intent=new Intent(getApplicationContext(),MapleLanguageActivity.class);
            startActivity(intent);
            break;
        case "Mercury":
            intent=new Intent(getApplicationContext(),MercuryLanguageActivity.class);
            startActivity(intent);
            break;
        case "ML":
            intent=new Intent(getApplicationContext(),MLLanguageActivity.class);
            startActivity(intent);
            break;
        case "MQL4":
            intent=new Intent(getApplicationContext(),MQL4LanguageActivity.class);
            startActivity(intent);
            break;
        case "NATURAL":
            intent=new Intent(getApplicationContext(),NATURALLanguageActivity.class);
            startActivity(intent);
            break;
        case "NXT-G":
            intent=new Intent(getApplicationContext(),NXTGLanguageActivity.class);
            startActivity(intent);
            break;
        case "OpenCL":
            intent=new Intent(getApplicationContext(),OpenCLLanguageActivity.class);
            startActivity(intent);
            break;
        case "Oz":
            intent=new Intent(getApplicationContext(),OzLanguageActivity.class);
            startActivity(intent);
            break;
        case "PL/I":
            intent=new Intent(getApplicationContext(),PL_SLASH_I_LanguageActivity.class);
            startActivity(intent);
            break;
        case "PostScript":
            intent=new Intent(getApplicationContext(),PostScriptLanguageActivity.class);
            startActivity(intent);
            break;
        case "Q":
            intent=new Intent(getApplicationContext(),Q_LanguageActivity.class);
            startActivity(intent);
            break;
        case "Racket":
            intent=new Intent(getApplicationContext(),RacketLanguageActivity.class);
            startActivity(intent);
            break;
        case "Red":
            intent=new Intent(getApplicationContext(),RedLanguageActivity.class);
            startActivity(intent);
            break;
        case "Ring":
            intent=new Intent(getApplicationContext(),RingLanguageActivity.class);
            startActivity(intent);
            break;
        case "RPG":
            intent=new Intent(getApplicationContext(),RPG_LanguageActivity.class);
            startActivity(intent);
            break;
        case "S":
            intent=new Intent(getApplicationContext(),S_LanguageActivity.class);
            startActivity(intent);
            break;
        case "SPARK":
            intent=new Intent(getApplicationContext(),SPARK_LanguageActivity.class);
            startActivity(intent);
            break;
        case "Spata":
            intent=new Intent(getApplicationContext(),SpataLanguageActivity.class);
            startActivity(intent);
            break;
        case "Vala":
            intent=new Intent(getApplicationContext(),ValaLanguageActivity.class);
            startActivity(intent);
            break;
        case "Verilog":
            intent=new Intent(getApplicationContext(),VerilogLanguageActivity.class);
            startActivity(intent);
            break;
        case "VHDL":
            intent=new Intent(getApplicationContext(),VHDLLanguageActivity.class);
            startActivity(intent);
            break;



    }

}
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        bottomNavigationView.setSelectedItemId(R.id.languages);

    }
//this method is for adding programming languages into the arrayList
   /*
    public void addLanguage(ArrayList<String> list){
       // list=new ArrayList<String>();

        list.add(getString(R.string.c));
        list.add(getString(R.string.java));
        list.add(getString(R.string.python));
        list.add(getString(R.string.cPLUSPLUS));
        list.add(getString(R.string.cHASH));
        list.add(getString(R.string.javascript));
        list.add(getString(R.string.php));
        list.add(getString(R.string.vb_net));
        list.add(getString(R.string.r));
        list.add(getString(R.string.sql));
        list.add(getString(R.string.go));
        list.add(getString(R.string.swift));
        list.add(getString(R.string.perl));
        list.add(getString(R.string.assemblyLanguage));
        list.add(getString(R.string.ruby));
        list.add(getString(R.string.matlab));
        list.add(getString(R.string.classicVisualBasic));
        list.add(getString(R.string.apacheGroovy));
        list.add(getString(R.string.objectC));
        list.add(getString(R.string.rust));
        list.add(getString(R.string.sas));
        list.add(getString(R.string.scratch));
        list.add(getString(R.string.d));
        list.add(getString(R.string.dart));
        list.add(getString(R.string.plsql));
        list.add(getString(R.string.logo));
        list.add(getString(R.string.delphi));
        list.add(getString(R.string.cobol));
        list.add(getString(R.string.kotlin));
        list.add(getString(R.string.openEdgeAbl));
        list.add(getString(R.string.julia));
        list.add(getString(R.string.abap));
        list.add(getString(R.string.scala));
        list.add(getString(R.string.transactSql));
        list.add(getString(R.string.scheme));
        list.add(getString(R.string.prolog));
        list.add(getString(R.string.ada));
        list.add(getString(R.string.lisp));
        list.add(getString(R.string.apex));
        list.add(getString(R.string.lua));
        list.add(getString(R.string.fortran));
        list.add(getString(R.string.haskell));
        list.add(getString(R.string.hack));
        list.add(getString(R.string.vbScript));
        list.add(getString(R.string.visualFoxPro));
        list.add(getString(R.string.typeScript));
        list.add(getString(R.string.awk));
        list.add(getString(R.string.actionScript));
        list.add(getString(R.string.tcl));
        list.add(getString(R.string.smalltalk));
        list.add(getString(R.string.abc));
        list.add(getString(R.string.alice));
        list.add(getString(R.string.apl));
        list.add(getString(R.string.autolisp));
        list.add(getString(R.string.bash));
        list.add(getString(R.string.bc));
        list.add(getString(R.string.bourneShell));
        list.add(getString(R.string.cShell));
        list.add(getString(R.string.clipper));
        list.add(getString(R.string.clojure));
        list.add(getString(R.string.coffeeScript));
        list.add(getString(R.string.commonLisp));
        list.add(getString(R.string.crystal));
        list.add(getString(R.string.cT));
        list.add(getString(R.string.elixir));
        list.add(getString(R.string.emacsLisp));
        list.add(getString(R.string.erlang));
        list.add(getString(R.string.euphoria));
        list.add(getString(R.string.fHASH));
        list.add(getString(R.string.forth));
        list.add(getString(R.string.genie));
        list.add(getString(R.string.icon));
        list.add(getString(R.string.idl));
        list.add(getString(R.string.inform));
        list.add(getString(R.string.io));
        list.add(getString(R.string.kornShell));
        list.add(getString(R.string.labView));
        list.add(getString(R.string.ladderLogic));
        list.add(getString(R.string.liveCode));
        list.add(getString(R.string.maple));
        list.add(getString(R.string.mercury));
        list.add(getString(R.string.ml));
        list.add(getString(R.string.mql4));
        list.add(getString(R.string.natural));
        list.add(getString(R.string.nxtG));
        list.add(getString(R.string.openCl));
        list.add(getString(R.string.oz));
        list.add(getString(R.string.pli));
        list.add(getString(R.string.postScript));
        list.add(getString(R.string.q));
        list.add(getString(R.string.racket));
        list.add(getString(R.string.red));
        list.add(getString(R.string.ring));
        list.add(getString(R.string.rpg));
        list.add(getString(R.string.s));
        list.add(getString(R.string.spark));
        list.add(getString(R.string.stata));
        list.add(getString(R.string.vala));
        list.add(getString(R.string.verilog));
        list.add(getString(R.string.vhdl));


    }*/
}