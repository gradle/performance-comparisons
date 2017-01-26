package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_165 {
    private final Production53_165 production = new Production53_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}