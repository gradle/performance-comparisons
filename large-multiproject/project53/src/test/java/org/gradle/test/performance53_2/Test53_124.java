package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_124 {
    private final Production53_124 production = new Production53_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}