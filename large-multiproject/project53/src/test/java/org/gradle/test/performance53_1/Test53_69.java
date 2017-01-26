package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_69 {
    private final Production53_69 production = new Production53_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}