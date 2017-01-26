package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_223 {
    private final Production53_223 production = new Production53_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}