package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_83 {
    private final Production53_83 production = new Production53_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}