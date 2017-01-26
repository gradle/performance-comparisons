package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_26 {
    private final Production53_26 production = new Production53_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}