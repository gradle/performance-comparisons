package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_30 {
    private final Production53_30 production = new Production53_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}