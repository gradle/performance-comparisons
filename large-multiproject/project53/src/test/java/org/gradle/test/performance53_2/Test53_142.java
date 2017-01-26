package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_142 {
    private final Production53_142 production = new Production53_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}