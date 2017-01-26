package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_103 {
    private final Production53_103 production = new Production53_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}