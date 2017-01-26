package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_114 {
    private final Production53_114 production = new Production53_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}