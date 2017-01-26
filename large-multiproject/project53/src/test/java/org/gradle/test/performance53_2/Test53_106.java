package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_106 {
    private final Production53_106 production = new Production53_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}