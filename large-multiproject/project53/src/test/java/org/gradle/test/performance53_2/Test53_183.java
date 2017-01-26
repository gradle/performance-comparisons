package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_183 {
    private final Production53_183 production = new Production53_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}