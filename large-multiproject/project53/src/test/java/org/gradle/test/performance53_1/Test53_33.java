package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_33 {
    private final Production53_33 production = new Production53_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}