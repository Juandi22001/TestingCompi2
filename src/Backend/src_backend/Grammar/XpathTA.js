/* parser generated by jison 0.4.18 */
/*
  Returns a Parser object of the following structure:

  Parser: {
    yy: {}
  }

  Parser.prototype: {
    yy: {},
    trace: function(),
    symbols_: {associative list: name ==> number},
    terminals_: {associative list: number ==> name},
    productions_: [...],
    performAction: function anonymous(yytext, yyleng, yylineno, yy, yystate, $$, _$),
    table: [...],
    defaultActions: {...},
    parseError: function(str, hash),
    parse: function(input),

    lexer: {
        EOF: 1,
        parseError: function(str, hash),
        setInput: function(input),
        input: function(),
        unput: function(str),
        more: function(),
        less: function(n),
        pastInput: function(),
        upcomingInput: function(),
        showPosition: function(),
        test_match: function(regex_match_array, rule_index),
        next: function(),
        lex: function(),
        begin: function(condition),
        popState: function(),
        _currentRules: function(),
        topState: function(),
        pushState: function(condition),

        options: {
            ranges: boolean           (optional: true ==> token location info will include a .range[] member)
            flex: boolean             (optional: true ==> flex-like lexing behaviour where the rules are tested exhaustively to find the longest match)
            backtrack_lexer: boolean  (optional: true ==> lexer regexes are tested in order and for each matching regex the action code is invoked; the lexer terminates the scan when a token is returned by the action code)
        },

        performAction: function(yy, yy_, $avoiding_name_collisions, YY_START),
        rules: [...],
        conditions: {associative list: name ==> set},
    }
  }


  token location info (@$, _$, etc.): {
    first_line: n,
    last_line: n,
    first_column: n,
    last_column: n,
    range: [start_number, end_number]       (where the numbers are indexes into the input string, regular zero-based)
  }


  the parseError function receives a 'hash' object with these members for lexer and parser errors: {
    text:        (matched text)
    token:       (the produced terminal token, if any)
    line:        (yylineno)
  }
  while parser (grammar) errors will also provide these members, i.e. parser errors deliver a superset of attributes: {
    loc:         (yylloc)
    expected:    (string describing the set of expected tokens)
    recoverable: (boolean: TRUE when the parser has a error recovery rule available for this particular error)
  }
*/
var XpathTA = (function(){
var o=function(k,v,o,l){for(o=o||{},l=k.length;l--;o[k[l]]=v);return o},$V0=[1,12],$V1=[1,4],$V2=[1,5],$V3=[1,7],$V4=[1,8],$V5=[1,9],$V6=[1,10],$V7=[1,11],$V8=[2,13,14,15,17,18,51,52,53,54,55,56,58,59,60],$V9=[8,11,12],$Va=[1,17],$Vb=[1,18],$Vc=[1,19],$Vd=[8,11,12,18,22,23,24,27,28,29,30,31,32,33,34,35],$Ve=[1,44],$Vf=[1,41],$Vg=[1,40],$Vh=[1,42],$Vi=[1,43],$Vj=[1,45],$Vk=[1,47],$Vl=[1,48],$Vm=[1,49],$Vn=[1,50],$Vo=[1,51],$Vp=[22,23,24],$Vq=[1,68],$Vr=[1,66],$Vs=[1,67],$Vt=[1,69],$Vu=[18,22,23,24,27,28,29,30,31,32,33,34,35],$Vv=[22,23,24,27,28,29,30,31,32,33,34];
var parser = {trace: function trace () { },
yy: {},
symbols_: {"error":2,"inicio":3,"xpath":4,"SEPARADOR":5,"simbolo":6,"produccion":7,"EOF":8,"produccionaux":9,"ComandosLocales":10,"SLASH":11,"SLASH_DOBLE":12,"PUNTO":13,"DOBLE_PUNTO":14,"ARROBA":15,"simboloaux":16,"ID":17,"MULTIPLICACION":18,"atributos":19,"COR_IZQUIERDO":20,"operacion":21,"COR_DERECHO":22,"AND":23,"OR":24,"operacion_relacional":25,"operacion_numerica":26,"IGUAL":27,"DIFERENTE":28,"MAYOR":29,"MENOR":30,"MAYOR_IGUAL":31,"MENOR_IGUAL":32,"MAS":33,"MENOS":34,"DIVISION":35,"valor":36,"ENTERO":37,"DECIMAL":38,"CADENA":39,"punto":40,"localaux":41,"LANG":42,"TEXTO":43,"PAR_IZQUIERDO":44,"PAR_DERECHO":45,"POSICION":46,"ULTIMO":47,"NODO":48,"local":49,"DOBLE_DOSPUNTOS":50,"ANCESTOR":51,"SELF":52,"ATTRIBUTE":53,"CHILD":54,"DESCENDANT":55,"PRECEDING":56,"SIBLING":57,"PARENT":58,"NAMESPACE":59,"FOLLOWING":60,"$accept":0,"$end":1},
terminals_: {2:"error",5:"SEPARADOR",8:"EOF",11:"SLASH",12:"SLASH_DOBLE",13:"PUNTO",14:"DOBLE_PUNTO",15:"ARROBA",17:"ID",18:"MULTIPLICACION",20:"COR_IZQUIERDO",22:"COR_DERECHO",23:"AND",24:"OR",27:"IGUAL",28:"DIFERENTE",29:"MAYOR",30:"MENOR",31:"MAYOR_IGUAL",32:"MENOR_IGUAL",33:"MAS",34:"MENOS",35:"DIVISION",37:"ENTERO",38:"DECIMAL",39:"CADENA",40:"punto",42:"LANG",43:"TEXTO",44:"PAR_IZQUIERDO",45:"PAR_DERECHO",46:"POSICION",47:"ULTIMO",48:"NODO",50:"DOBLE_DOSPUNTOS",51:"ANCESTOR",52:"SELF",53:"ATTRIBUTE",54:"CHILD",55:"DESCENDANT",56:"PRECEDING",57:"SIBLING",58:"PARENT",59:"NAMESPACE",60:"FOLLOWING"},
productions_: [0,[3,3],[3,1],[4,3],[4,2],[7,3],[7,3],[7,1],[6,1],[6,1],[9,1],[9,1],[9,2],[9,1],[9,1],[9,1],[9,2],[9,2],[19,3],[21,3],[21,3],[21,1],[25,3],[25,3],[25,3],[25,3],[25,3],[25,3],[25,1],[26,3],[26,3],[26,3],[26,3],[26,1],[36,1],[36,1],[36,1],[36,1],[36,2],[36,1],[36,1],[41,1],[41,3],[41,3],[41,3],[41,3],[16,1],[16,1],[16,1],[10,3],[10,3],[49,1],[49,5],[49,1],[49,1],[49,1],[49,5],[49,1],[49,3],[49,1],[49,1],[49,1],[49,1],[49,3]],
performAction: function anonymous(yytext, yyleng, yylineno, yy, yystate /* action[1] */, $$ /* vstack */, _$ /* lstack */) {
/* this == yyval */

var $0 = $$.length - 1;
switch (yystate) {
case 17:
console.log("error sintactico")
        
                new ControlError(yytext, TipoSeleccion.ERROR_SINTACTICO, this._$.first_line, this._$.first_column,"XPathAscendente")
    
        
        
break;
case 19:
this.$ = $$[$0-2] + "and" + $$[$0];
break;
case 20:
this.$ = $$[$0-2] + "or" + $$[$0];
break;
case 21: case 28: case 33: case 34: case 35: case 36:
this.$ = $$[$0];
break;
case 22:
this.$ = $$[$0-2] + "==" + $$[$0];
break;
case 23:
this.$ = $$[$0-2] + "!=" + $$[$0];
break;
case 24:
this.$ = $$[$0-2] + ">" + $$[$0];
break;
case 25:
this.$ = $$[$0-2] + "<" + $$[$0];
break;
case 26:
this.$ = $$[$0-2] + ">=" + $$[$0];
break;
case 27:
this.$ = $$[$0-2] + "<=" + $$[$0];
break;
case 29:
this.$ = $$[$0-2] + "+" + $$[$0];
break;
case 30:
this.$ = $$[$0-2] + "-" + $$[$0];
break;
case 31:
this.$ = $$[$0-2] + "*" + $$[$0];
break;
case 32:
this.$ = $$[$0-2] + "/" + $$[$0];
break;
case 37:
this.$ = '\"'+$$[$0]+'\"';
break;
}
},
table: [{2:$V0,4:1,6:2,7:3,9:6,11:$V1,12:$V2,13:$V3,14:$V4,15:$V5,17:$V6,18:$V7},{1:[3]},{2:$V0,7:13,9:6,13:$V3,14:$V4,15:$V5,17:$V6,18:$V7},{6:15,8:[1,14],11:$V1,12:$V2},o($V8,[2,8]),o($V8,[2,9]),o($V9,[2,7]),o($V9,[2,10]),o($V9,[2,11]),o($V9,[2,13],{16:16,17:$Va,18:$Vb,42:$Vc}),o($V9,[2,14],{19:20,20:[1,21]}),o($V9,[2,15]),{5:[1,22]},{6:15,8:[1,23],11:$V1,12:$V2},{1:[2,4]},{2:$V0,9:24,10:25,13:$V3,14:$V4,15:$V5,17:$V6,18:$V7,49:26,51:[1,27],52:[1,33],53:[1,28],54:[1,29],55:[1,30],56:[1,31],58:[1,32],59:[1,34],60:[1,35]},o($V9,[2,12]),o($Vd,[2,46]),o($Vd,[2,47]),o($Vd,[2,48]),o($V9,[2,16]),{15:$Ve,17:$Vf,21:36,25:37,26:38,36:39,37:$Vg,38:$Vh,39:$Vi,40:$Vj,41:46,42:$Vk,43:$Vl,46:$Vm,47:$Vn,48:$Vo},o($V9,[2,17]),{1:[2,3]},o($V9,[2,5]),o($V9,[2,6]),{50:[1,52]},{34:[1,53],50:[2,51]},{50:[2,53]},{50:[2,54]},{34:[1,54],50:[2,55]},{34:[1,55],50:[2,57]},{50:[2,59]},{50:[2,60]},{50:[2,61]},{34:[1,56],50:[2,62]},{22:[1,57],23:[1,58],24:[1,59]},o($Vp,[2,21]),o($Vp,[2,28],{18:$Vq,27:[1,60],28:[1,61],29:[1,62],30:[1,63],31:[1,64],32:[1,65],33:$Vr,34:$Vs,35:$Vt}),o($Vu,[2,33]),o($Vd,[2,34]),o($Vd,[2,35]),o($Vd,[2,36]),o($Vd,[2,37]),{16:70,17:$Va,18:$Vb,42:$Vc},o($Vd,[2,39]),o($Vd,[2,40]),o($Vd,[2,41]),{44:[1,71]},{44:[1,72]},{44:[1,73]},{44:[1,74]},{15:$Ve,17:$Vf,18:[1,76],36:75,37:$Vg,38:$Vh,39:$Vi,40:$Vj,41:46,42:$Vk,43:$Vl,46:$Vm,47:$Vn,48:$Vo},{24:[1,77]},{24:[1,78]},{57:[1,79]},{57:[1,80]},o($V9,[2,18]),{15:$Ve,17:$Vf,21:81,25:37,26:38,36:39,37:$Vg,38:$Vh,39:$Vi,40:$Vj,41:46,42:$Vk,43:$Vl,46:$Vm,47:$Vn,48:$Vo},{15:$Ve,17:$Vf,21:82,25:37,26:38,36:39,37:$Vg,38:$Vh,39:$Vi,40:$Vj,41:46,42:$Vk,43:$Vl,46:$Vm,47:$Vn,48:$Vo},{15:$Ve,17:$Vf,26:83,36:39,37:$Vg,38:$Vh,39:$Vi,40:$Vj,41:46,42:$Vk,43:$Vl,46:$Vm,47:$Vn,48:$Vo},{15:$Ve,17:$Vf,26:84,36:39,37:$Vg,38:$Vh,39:$Vi,40:$Vj,41:46,42:$Vk,43:$Vl,46:$Vm,47:$Vn,48:$Vo},{15:$Ve,17:$Vf,26:85,36:39,37:$Vg,38:$Vh,39:$Vi,40:$Vj,41:46,42:$Vk,43:$Vl,46:$Vm,47:$Vn,48:$Vo},{15:$Ve,17:$Vf,26:86,36:39,37:$Vg,38:$Vh,39:$Vi,40:$Vj,41:46,42:$Vk,43:$Vl,46:$Vm,47:$Vn,48:$Vo},{15:$Ve,17:$Vf,26:87,36:39,37:$Vg,38:$Vh,39:$Vi,40:$Vj,41:46,42:$Vk,43:$Vl,46:$Vm,47:$Vn,48:$Vo},{15:$Ve,17:$Vf,26:88,36:39,37:$Vg,38:$Vh,39:$Vi,40:$Vj,41:46,42:$Vk,43:$Vl,46:$Vm,47:$Vn,48:$Vo},{15:$Ve,17:$Vf,26:89,36:39,37:$Vg,38:$Vh,39:$Vi,40:$Vj,41:46,42:$Vk,43:$Vl,46:$Vm,47:$Vn,48:$Vo},{15:$Ve,17:$Vf,26:90,36:39,37:$Vg,38:$Vh,39:$Vi,40:$Vj,41:46,42:$Vk,43:$Vl,46:$Vm,47:$Vn,48:$Vo},{15:$Ve,17:$Vf,26:91,36:39,37:$Vg,38:$Vh,39:$Vi,40:$Vj,41:46,42:$Vk,43:$Vl,46:$Vm,47:$Vn,48:$Vo},{15:$Ve,17:$Vf,26:92,36:39,37:$Vg,38:$Vh,39:$Vi,40:$Vj,41:46,42:$Vk,43:$Vl,46:$Vm,47:$Vn,48:$Vo},o($Vd,[2,38]),{45:[1,93]},{45:[1,94]},{45:[1,95]},{45:[1,96]},o($V9,[2,49]),o($V9,[2,50]),{34:[1,97]},{34:[1,98]},{50:[2,58]},{50:[2,63]},o($Vp,[2,19]),o($Vp,[2,20]),o($Vp,[2,22],{18:$Vq,33:$Vr,34:$Vs,35:$Vt}),o($Vp,[2,23],{18:$Vq,33:$Vr,34:$Vs,35:$Vt}),o($Vp,[2,24],{18:$Vq,33:$Vr,34:$Vs,35:$Vt}),o($Vp,[2,25],{18:$Vq,33:$Vr,34:$Vs,35:$Vt}),o($Vp,[2,26],{18:$Vq,33:$Vr,34:$Vs,35:$Vt}),o($Vp,[2,27],{18:$Vq,33:$Vr,34:$Vs,35:$Vt}),o($Vv,[2,29],{18:$Vq,35:$Vt}),o($Vv,[2,30],{18:$Vq,35:$Vt}),o($Vu,[2,31]),o($Vu,[2,32]),o($Vd,[2,42]),o($Vd,[2,43]),o($Vd,[2,44]),o($Vd,[2,45]),{52:[1,99]},{52:[1,100]},{50:[2,52]},{50:[2,56]}],
defaultActions: {14:[2,4],23:[2,3],28:[2,53],29:[2,54],32:[2,59],33:[2,60],34:[2,61],79:[2,58],80:[2,63],99:[2,52],100:[2,56]},
parseError: function parseError (str, hash) {
    if (hash.recoverable) {
        this.trace(str);
    } else {
        var error = new Error(str);
        error.hash = hash;
        throw error;
    }
},
parse: function parse (input) {
    var self = this,
        stack = [0],
        tstack = [], // token stack
        vstack = [null], // semantic value stack
        lstack = [], // location stack
        table = this.table,
        yytext = '',
        yylineno = 0,
        yyleng = 0,
        recovering = 0,
        TERROR = 2,
        EOF = 1;

    var args = lstack.slice.call(arguments, 1);

    //this.reductionCount = this.shiftCount = 0;

    var lexer = Object.create(this.lexer);
    var sharedState = { yy: {} };
    // copy state
    for (var k in this.yy) {
      if (Object.prototype.hasOwnProperty.call(this.yy, k)) {
        sharedState.yy[k] = this.yy[k];
      }
    }

    lexer.setInput(input, sharedState.yy);
    sharedState.yy.lexer = lexer;
    sharedState.yy.parser = this;
    if (typeof lexer.yylloc == 'undefined') {
        lexer.yylloc = {};
    }
    var yyloc = lexer.yylloc;
    lstack.push(yyloc);

    var ranges = lexer.options && lexer.options.ranges;

    if (typeof sharedState.yy.parseError === 'function') {
        this.parseError = sharedState.yy.parseError;
    } else {
        this.parseError = Object.getPrototypeOf(this).parseError;
    }

    function popStack (n) {
        stack.length = stack.length - 2 * n;
        vstack.length = vstack.length - n;
        lstack.length = lstack.length - n;
    }

_token_stack:
    var lex = function () {
        var token;
        token = lexer.lex() || EOF;
        // if token isn't its numeric value, convert
        if (typeof token !== 'number') {
            token = self.symbols_[token] || token;
        }
        return token;
    }

    var symbol, preErrorSymbol, state, action, a, r, yyval = {}, p, len, newState, expected;
    while (true) {
        // retreive state number from top of stack
        state = stack[stack.length - 1];

        // use default actions if available
        if (this.defaultActions[state]) {
            action = this.defaultActions[state];
        } else {
            if (symbol === null || typeof symbol == 'undefined') {
                symbol = lex();
            }
            // read action for current state and first input
            action = table[state] && table[state][symbol];
        }

_handle_error:
        // handle parse error
        if (typeof action === 'undefined' || !action.length || !action[0]) {
            var error_rule_depth;
            var errStr = '';

            // Return the rule stack depth where the nearest error rule can be found.
            // Return FALSE when no error recovery rule was found.
            function locateNearestErrorRecoveryRule(state) {
                var stack_probe = stack.length - 1;
                var depth = 0;

                // try to recover from error
                for(;;) {
                    // check for error recovery rule in this state
                    if ((TERROR.toString()) in table[state]) {
                        return depth;
                    }
                    if (state === 0 || stack_probe < 2) {
                        return false; // No suitable error recovery rule available.
                    }
                    stack_probe -= 2; // popStack(1): [symbol, action]
                    state = stack[stack_probe];
                    ++depth;
                }
            }

            if (!recovering) {
                // first see if there's any chance at hitting an error recovery rule:
                error_rule_depth = locateNearestErrorRecoveryRule(state);

                // Report error
                expected = [];
                for (p in table[state]) {
                    if (this.terminals_[p] && p > TERROR) {
                        expected.push("'"+this.terminals_[p]+"'");
                    }
                }
                if (lexer.showPosition) {
                    errStr = 'Parse error on line '+(yylineno+1)+":\n"+lexer.showPosition()+"\nExpecting "+expected.join(', ') + ", got '" + (this.terminals_[symbol] || symbol)+ "'";
                } else {
                    errStr = 'Parse error on line '+(yylineno+1)+": Unexpected " +
                                  (symbol == EOF ? "end of input" :
                                              ("'"+(this.terminals_[symbol] || symbol)+"'"));
                }
                this.parseError(errStr, {
                    text: lexer.match,
                    token: this.terminals_[symbol] || symbol,
                    line: lexer.yylineno,
                    loc: yyloc,
                    expected: expected,
                    recoverable: (error_rule_depth !== false)
                });
            } else if (preErrorSymbol !== EOF) {
                error_rule_depth = locateNearestErrorRecoveryRule(state);
            }

            // just recovered from another error
            if (recovering == 3) {
                if (symbol === EOF || preErrorSymbol === EOF) {
                    throw new Error(errStr || 'Parsing halted while starting to recover from another error.');
                }

                // discard current lookahead and grab another
                yyleng = lexer.yyleng;
                yytext = lexer.yytext;
                yylineno = lexer.yylineno;
                yyloc = lexer.yylloc;
                symbol = lex();
            }

            // try to recover from error
            if (error_rule_depth === false) {
                throw new Error(errStr || 'Parsing halted. No suitable error recovery rule available.');
            }
            popStack(error_rule_depth);

            preErrorSymbol = (symbol == TERROR ? null : symbol); // save the lookahead token
            symbol = TERROR;         // insert generic error symbol as new lookahead
            state = stack[stack.length-1];
            action = table[state] && table[state][TERROR];
            recovering = 3; // allow 3 real symbols to be shifted before reporting a new error
        }

        // this shouldn't happen, unless resolve defaults are off
        if (action[0] instanceof Array && action.length > 1) {
            throw new Error('Parse Error: multiple actions possible at state: '+state+', token: '+symbol);
        }

        switch (action[0]) {
            case 1: // shift
                //this.shiftCount++;

                stack.push(symbol);
                vstack.push(lexer.yytext);
                lstack.push(lexer.yylloc);
                stack.push(action[1]); // push state
                symbol = null;
                if (!preErrorSymbol) { // normal execution/no error
                    yyleng = lexer.yyleng;
                    yytext = lexer.yytext;
                    yylineno = lexer.yylineno;
                    yyloc = lexer.yylloc;
                    if (recovering > 0) {
                        recovering--;
                    }
                } else {
                    // error just occurred, resume old lookahead f/ before error
                    symbol = preErrorSymbol;
                    preErrorSymbol = null;
                }
                break;

            case 2:
                // reduce
                //this.reductionCount++;

                len = this.productions_[action[1]][1];

                // perform semantic action
                yyval.$ = vstack[vstack.length-len]; // default to $$ = $1
                // default location, uses first token for firsts, last for lasts
                yyval._$ = {
                    first_line: lstack[lstack.length-(len||1)].first_line,
                    last_line: lstack[lstack.length-1].last_line,
                    first_column: lstack[lstack.length-(len||1)].first_column,
                    last_column: lstack[lstack.length-1].last_column
                };
                if (ranges) {
                  yyval._$.range = [lstack[lstack.length-(len||1)].range[0], lstack[lstack.length-1].range[1]];
                }
                r = this.performAction.apply(yyval, [yytext, yyleng, yylineno, sharedState.yy, action[1], vstack, lstack].concat(args));

                if (typeof r !== 'undefined') {
                    return r;
                }

                // pop off stack
                if (len) {
                    stack = stack.slice(0,-1*len*2);
                    vstack = vstack.slice(0, -1*len);
                    lstack = lstack.slice(0, -1*len);
                }

                stack.push(this.productions_[action[1]][0]);    // push nonterminal (reduce)
                vstack.push(yyval.$);
                lstack.push(yyval._$);
                // goto new state = table[STATE][NONTERMINAL]
                newState = table[stack[stack.length-2]][stack[stack.length-1]];
                stack.push(newState);
                break;

            case 3:
                // accept
                return true;
        }

    }

    return true;
}};
    
        const { ControlError } = require('../Xpath/ControlError')
            const { TipoSeleccion } = require('../Xpath/TipoSeleccion')

//importaciones y demas    
/* generated by jison-lex 0.3.4 */
var lexer = (function(){
var lexer = ({

EOF:1,

parseError:function parseError(str, hash) {
        if (this.yy.parser) {
            this.yy.parser.parseError(str, hash);
        } else {
            throw new Error(str);
        }
    },

// resets the lexer, sets new input
setInput:function (input, yy) {
        this.yy = yy || this.yy || {};
        this._input = input;
        this._more = this._backtrack = this.done = false;
        this.yylineno = this.yyleng = 0;
        this.yytext = this.matched = this.match = '';
        this.conditionStack = ['INITIAL'];
        this.yylloc = {
            first_line: 1,
            first_column: 0,
            last_line: 1,
            last_column: 0
        };
        if (this.options.ranges) {
            this.yylloc.range = [0,0];
        }
        this.offset = 0;
        return this;
    },

// consumes and returns one char from the input
input:function () {
        var ch = this._input[0];
        this.yytext += ch;
        this.yyleng++;
        this.offset++;
        this.match += ch;
        this.matched += ch;
        var lines = ch.match(/(?:\r\n?|\n).*/g);
        if (lines) {
            this.yylineno++;
            this.yylloc.last_line++;
        } else {
            this.yylloc.last_column++;
        }
        if (this.options.ranges) {
            this.yylloc.range[1]++;
        }

        this._input = this._input.slice(1);
        return ch;
    },

// unshifts one char (or a string) into the input
unput:function (ch) {
        var len = ch.length;
        var lines = ch.split(/(?:\r\n?|\n)/g);

        this._input = ch + this._input;
        this.yytext = this.yytext.substr(0, this.yytext.length - len);
        //this.yyleng -= len;
        this.offset -= len;
        var oldLines = this.match.split(/(?:\r\n?|\n)/g);
        this.match = this.match.substr(0, this.match.length - 1);
        this.matched = this.matched.substr(0, this.matched.length - 1);

        if (lines.length - 1) {
            this.yylineno -= lines.length - 1;
        }
        var r = this.yylloc.range;

        this.yylloc = {
            first_line: this.yylloc.first_line,
            last_line: this.yylineno + 1,
            first_column: this.yylloc.first_column,
            last_column: lines ?
                (lines.length === oldLines.length ? this.yylloc.first_column : 0)
                 + oldLines[oldLines.length - lines.length].length - lines[0].length :
              this.yylloc.first_column - len
        };

        if (this.options.ranges) {
            this.yylloc.range = [r[0], r[0] + this.yyleng - len];
        }
        this.yyleng = this.yytext.length;
        return this;
    },

// When called from action, caches matched text and appends it on next action
more:function () {
        this._more = true;
        return this;
    },

// When called from action, signals the lexer that this rule fails to match the input, so the next matching rule (regex) should be tested instead.
reject:function () {
        if (this.options.backtrack_lexer) {
            this._backtrack = true;
        } else {
            return this.parseError('Lexical error on line ' + (this.yylineno + 1) + '. You can only invoke reject() in the lexer when the lexer is of the backtracking persuasion (options.backtrack_lexer = true).\n' + this.showPosition(), {
                text: "",
                token: null,
                line: this.yylineno
            });

        }
        return this;
    },

// retain first n characters of the match
less:function (n) {
        this.unput(this.match.slice(n));
    },

// displays already matched input, i.e. for error messages
pastInput:function () {
        var past = this.matched.substr(0, this.matched.length - this.match.length);
        return (past.length > 20 ? '...':'') + past.substr(-20).replace(/\n/g, "");
    },

// displays upcoming input, i.e. for error messages
upcomingInput:function () {
        var next = this.match;
        if (next.length < 20) {
            next += this._input.substr(0, 20-next.length);
        }
        return (next.substr(0,20) + (next.length > 20 ? '...' : '')).replace(/\n/g, "");
    },

// displays the character position where the lexing error occurred, i.e. for error messages
showPosition:function () {
        var pre = this.pastInput();
        var c = new Array(pre.length + 1).join("-");
        return pre + this.upcomingInput() + "\n" + c + "^";
    },

// test the lexed token: return FALSE when not a match, otherwise return token
test_match:function(match, indexed_rule) {
        var token,
            lines,
            backup;

        if (this.options.backtrack_lexer) {
            // save context
            backup = {
                yylineno: this.yylineno,
                yylloc: {
                    first_line: this.yylloc.first_line,
                    last_line: this.last_line,
                    first_column: this.yylloc.first_column,
                    last_column: this.yylloc.last_column
                },
                yytext: this.yytext,
                match: this.match,
                matches: this.matches,
                matched: this.matched,
                yyleng: this.yyleng,
                offset: this.offset,
                _more: this._more,
                _input: this._input,
                yy: this.yy,
                conditionStack: this.conditionStack.slice(0),
                done: this.done
            };
            if (this.options.ranges) {
                backup.yylloc.range = this.yylloc.range.slice(0);
            }
        }

        lines = match[0].match(/(?:\r\n?|\n).*/g);
        if (lines) {
            this.yylineno += lines.length;
        }
        this.yylloc = {
            first_line: this.yylloc.last_line,
            last_line: this.yylineno + 1,
            first_column: this.yylloc.last_column,
            last_column: lines ?
                         lines[lines.length - 1].length - lines[lines.length - 1].match(/\r?\n?/)[0].length :
                         this.yylloc.last_column + match[0].length
        };
        this.yytext += match[0];
        this.match += match[0];
        this.matches = match;
        this.yyleng = this.yytext.length;
        if (this.options.ranges) {
            this.yylloc.range = [this.offset, this.offset += this.yyleng];
        }
        this._more = false;
        this._backtrack = false;
        this._input = this._input.slice(match[0].length);
        this.matched += match[0];
        token = this.performAction.call(this, this.yy, this, indexed_rule, this.conditionStack[this.conditionStack.length - 1]);
        if (this.done && this._input) {
            this.done = false;
        }
        if (token) {
            return token;
        } else if (this._backtrack) {
            // recover context
            for (var k in backup) {
                this[k] = backup[k];
            }
            return false; // rule action called reject() implying the next rule should be tested instead.
        }
        return false;
    },

// return next match in input
next:function () {
        if (this.done) {
            return this.EOF;
        }
        if (!this._input) {
            this.done = true;
        }

        var token,
            match,
            tempMatch,
            index;
        if (!this._more) {
            this.yytext = '';
            this.match = '';
        }
        var rules = this._currentRules();
        for (var i = 0; i < rules.length; i++) {
            tempMatch = this._input.match(this.rules[rules[i]]);
            if (tempMatch && (!match || tempMatch[0].length > match[0].length)) {
                match = tempMatch;
                index = i;
                if (this.options.backtrack_lexer) {
                    token = this.test_match(tempMatch, rules[i]);
                    if (token !== false) {
                        return token;
                    } else if (this._backtrack) {
                        match = false;
                        continue; // rule action called reject() implying a rule MISmatch.
                    } else {
                        // else: this is a lexer rule which consumes input without producing a token (e.g. whitespace)
                        return false;
                    }
                } else if (!this.options.flex) {
                    break;
                }
            }
        }
        if (match) {
            token = this.test_match(match, rules[index]);
            if (token !== false) {
                return token;
            }
            // else: this is a lexer rule which consumes input without producing a token (e.g. whitespace)
            return false;
        }
        if (this._input === "") {
            return this.EOF;
        } else {
            return this.parseError('Lexical error on line ' + (this.yylineno + 1) + '. Unrecognized text.\n' + this.showPosition(), {
                text: "",
                token: null,
                line: this.yylineno
            });
        }
    },

// return next match that has a token
lex:function lex () {
        var r = this.next();
        if (r) {
            return r;
        } else {
            return this.lex();
        }
    },

// activates a new lexer condition state (pushes the new lexer condition state onto the condition stack)
begin:function begin (condition) {
        this.conditionStack.push(condition);
    },

// pop the previously active lexer condition state off the condition stack
popState:function popState () {
        var n = this.conditionStack.length - 1;
        if (n > 0) {
            return this.conditionStack.pop();
        } else {
            return this.conditionStack[0];
        }
    },

// produce the lexer rule set which is active for the currently active lexer condition state
_currentRules:function _currentRules () {
        if (this.conditionStack.length && this.conditionStack[this.conditionStack.length - 1]) {
            return this.conditions[this.conditionStack[this.conditionStack.length - 1]].rules;
        } else {
            return this.conditions["INITIAL"].rules;
        }
    },

// return the currently active lexer condition state; when an index argument is provided it produces the N-th previous condition state, if available
topState:function topState (n) {
        n = this.conditionStack.length - 1 - Math.abs(n || 0);
        if (n >= 0) {
            return this.conditionStack[n];
        } else {
            return "INITIAL";
        }
    },

// alias for begin(condition)
pushState:function pushState (condition) {
        this.begin(condition);
    },

// return the number of states currently on the stack
stateStackSize:function stateStackSize() {
        return this.conditionStack.length;
    },
options: {"case-insensitive":true},
performAction: function anonymous(yy,yy_,$avoiding_name_collisions,YY_START) {
var YYSTATE=YY_START;
switch($avoiding_name_collisions) {
case 0:
break;
case 1:return 30
break;
case 2:return 29
break;
case 3:return 12
break;
case 4:return 11
break;
case 5:return 27
break;
case 6:return 5
break;
case 7:return 33
break;
case 8:return 34
break;
case 9:return 18
break;
case 10:return 35
break;
case 11:return 28
break;
case 12:return 31
break;
case 13:return 32
break;
case 14:return 23
break;
case 15:return 24
break;
case 16:return 'MODULAR'
break;
case 17:return 15
break;
case 18:return 13
break;
case 19:return 14 
break;
case 20:return 50
break;
case 21:return 20
break;
case 22:return 22
break;
case 23:return 44
break;
case 24:return 45
break;
case 25:return 51
break;
case 26:return 53
break;
case 27:return 54
break;
case 28:return 55
break;
case 29:return 60
break;
case 30:return "NAMESPACE"
break;
case 31:return 58
break;
case 32:return 56
break;
case 33:return 52
break;
case 34:return 'SILBLING'
break;
case 35:return 48
break;
case 36:return 42   
break;
case 37:return 46
break;
case 38:return 47
break;
case 39:return 43
break;
case 40: yy_.yytext = yy_.yytext.substr(1,yy_.yyleng-2); return 39; 
break;
case 41:return 38;
break;
case 42:return 37
break;
case 43:return 17
break;
case 44:return 8;
break;
case 45:console.log(yy_.yytext,"ErroreLexico");new ControlError(yy_.yytext, TipoSeleccion.ERROR_LEXICO, yy_.yylloc.first_line,yy_.yylloc.first_column,"XpathAscendente") 
break;
}
},
rules: [/^(?:[\s]+)/i,/^(?:<)/i,/^(?:>)/i,/^(?:\/\/)/i,/^(?:\/)/i,/^(?:=)/i,/^(?:\|)/i,/^(?:\+)/i,/^(?:-)/i,/^(?:\*)/i,/^(?:div\b)/i,/^(?:!=)/i,/^(?:>=)/i,/^(?:<=)/i,/^(?:and\b)/i,/^(?:or\b)/i,/^(?:mod\b)/i,/^(?:@)/i,/^(?:\.)/i,/^(?:\.\.)/i,/^(?:::)/i,/^(?:\[)/i,/^(?:\])/i,/^(?:\()/i,/^(?:\))/i,/^(?:ancestor\b)/i,/^(?:attribute\b)/i,/^(?:child\b)/i,/^(?:descendant\b)/i,/^(?:following\b)/i,/^(?:namespace\b)/i,/^(?:parent\b)/i,/^(?:preceding\b)/i,/^(?:self\b)/i,/^(?:silbling\b)/i,/^(?:node\b)/i,/^(?:lang\b)/i,/^(?:position\b)/i,/^(?:last\b)/i,/^(?:text\b)/i,/^(?:'[^\']*')/i,/^(?:[0-9]+(\.[0-9]+)?\b)/i,/^(?:[0-9]+\b)/i,/^(?:[a-zA-Z_][a-zA-Z0-9_]*)/i,/^(?:$)/i,/^(?:.)/i],
conditions: {"INITIAL":{"rules":[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45],"inclusive":true}}
});
return lexer;
})();
parser.lexer = lexer;
function Parser () {
  this.yy = {};
}
Parser.prototype = parser;parser.Parser = Parser;
return new Parser;
})();


if (typeof require !== 'undefined' && typeof exports !== 'undefined') {
exports.parser = XpathTA;
exports.Parser = XpathTA.Parser;
exports.parse = function () { return XpathTA.parse.apply(XpathTA, arguments); };
exports.main = function commonjsMain (args) {
    if (!args[1]) {
        console.log('Usage: '+args[0]+' FILE');
        process.exit(1);
    }
    var source = require('fs').readFileSync(require('path').normalize(args[1]), "utf8");
    return exports.parser.parse(source);
};
if (typeof module !== 'undefined' && require.main === module) {
  exports.main(process.argv.slice(1));
}
}