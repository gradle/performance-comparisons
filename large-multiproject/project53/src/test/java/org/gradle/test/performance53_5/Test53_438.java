package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_438 {
    private final Production53_438 production = new Production53_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}