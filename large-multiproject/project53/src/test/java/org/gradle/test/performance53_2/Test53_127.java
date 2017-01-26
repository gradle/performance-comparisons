package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_127 {
    private final Production53_127 production = new Production53_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}