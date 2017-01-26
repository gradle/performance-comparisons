package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_149 {
    private final Production53_149 production = new Production53_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}