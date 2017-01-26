package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_150 {
    private final Production53_150 production = new Production53_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}