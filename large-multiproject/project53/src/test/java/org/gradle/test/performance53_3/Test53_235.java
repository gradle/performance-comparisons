package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_235 {
    private final Production53_235 production = new Production53_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}