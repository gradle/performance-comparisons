package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_17 {
    private final Production53_17 production = new Production53_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}