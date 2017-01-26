package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_52 {
    private final Production53_52 production = new Production53_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}