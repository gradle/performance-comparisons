package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_161 {
    private final Production53_161 production = new Production53_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}