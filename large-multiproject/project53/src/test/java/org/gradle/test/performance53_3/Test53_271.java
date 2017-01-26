package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_271 {
    private final Production53_271 production = new Production53_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}