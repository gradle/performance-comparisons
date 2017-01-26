package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_447 {
    private final Production53_447 production = new Production53_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}