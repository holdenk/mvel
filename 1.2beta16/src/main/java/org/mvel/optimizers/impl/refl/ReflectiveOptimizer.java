package org.mvel.optimizers.impl.refl;

import org.mvel.Token;
import org.mvel.TokenIterator;
import org.mvel.TokenSet;
import org.mvel.integration.VariableResolverFactory;
import org.mvel.optimizers.Optimizer;

/**
 * @author Christopher Brock
 */
public class ReflectiveOptimizer implements Optimizer {

    public TokenIterator optimize(TokenSet tokens, Object ctx, VariableResolverFactory factory) {
        TokenSet optimized = new TokenSet();
        tokens.reset();

        Token[] t = new Token[3];
        int i = 0;

        while (tokens.hasMoreTokens()) {
            t[i++] = tokens.nextToken();
            if (i == 3) {
                if (t[1].isOperator() && t[1].getOperator() < 12) {
                    //     Arithmetic a = new Arithmetic(t[1], t[0].get, t[2]);
                }

            }
        }

        return null;
    }

    public String getName() {
        return "reflective";
    }
}