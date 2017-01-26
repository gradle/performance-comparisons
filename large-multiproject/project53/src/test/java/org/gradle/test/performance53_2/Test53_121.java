package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_121 {
    private final Production53_121 production = new Production53_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}