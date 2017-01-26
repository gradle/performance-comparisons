package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_79 {
    private final Production53_79 production = new Production53_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}