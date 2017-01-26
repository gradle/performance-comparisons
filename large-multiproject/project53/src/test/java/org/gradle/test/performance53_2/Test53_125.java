package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_125 {
    private final Production53_125 production = new Production53_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}