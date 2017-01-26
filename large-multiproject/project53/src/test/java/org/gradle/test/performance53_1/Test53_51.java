package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_51 {
    private final Production53_51 production = new Production53_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}