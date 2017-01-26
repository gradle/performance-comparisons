package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_345 {
    private final Production53_345 production = new Production53_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}