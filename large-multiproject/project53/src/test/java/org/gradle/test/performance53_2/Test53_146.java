package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_146 {
    private final Production53_146 production = new Production53_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}