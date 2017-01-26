package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_177 {
    private final Production53_177 production = new Production53_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}