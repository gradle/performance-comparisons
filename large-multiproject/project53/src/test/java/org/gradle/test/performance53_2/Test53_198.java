package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_198 {
    private final Production53_198 production = new Production53_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}