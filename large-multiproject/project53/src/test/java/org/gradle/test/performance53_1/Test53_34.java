package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_34 {
    private final Production53_34 production = new Production53_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}