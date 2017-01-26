package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_476 {
    private final Production53_476 production = new Production53_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}