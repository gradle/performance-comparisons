package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_265 {
    private final Production53_265 production = new Production53_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}