package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_216 {
    private final Production53_216 production = new Production53_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}