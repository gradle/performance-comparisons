package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_352 {
    private final Production53_352 production = new Production53_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}