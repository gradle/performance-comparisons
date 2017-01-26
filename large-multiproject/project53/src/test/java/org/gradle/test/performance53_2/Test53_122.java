package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_122 {
    private final Production53_122 production = new Production53_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}