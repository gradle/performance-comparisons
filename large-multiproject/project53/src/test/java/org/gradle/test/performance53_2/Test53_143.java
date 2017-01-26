package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_143 {
    private final Production53_143 production = new Production53_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}