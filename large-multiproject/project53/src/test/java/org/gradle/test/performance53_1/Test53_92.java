package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_92 {
    private final Production53_92 production = new Production53_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}