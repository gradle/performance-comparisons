package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_136 {
    private final Production53_136 production = new Production53_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}