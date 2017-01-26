package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_181 {
    private final Production53_181 production = new Production53_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}