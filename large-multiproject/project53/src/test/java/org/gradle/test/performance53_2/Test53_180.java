package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_180 {
    private final Production53_180 production = new Production53_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}