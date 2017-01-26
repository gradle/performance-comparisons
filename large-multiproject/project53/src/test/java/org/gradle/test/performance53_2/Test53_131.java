package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_131 {
    private final Production53_131 production = new Production53_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}