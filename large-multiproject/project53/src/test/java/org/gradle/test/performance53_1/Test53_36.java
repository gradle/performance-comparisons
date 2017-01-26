package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_36 {
    private final Production53_36 production = new Production53_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}