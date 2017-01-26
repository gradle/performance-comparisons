package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_169 {
    private final Production53_169 production = new Production53_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}