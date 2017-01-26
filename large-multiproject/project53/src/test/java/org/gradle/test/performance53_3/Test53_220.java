package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_220 {
    private final Production53_220 production = new Production53_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}