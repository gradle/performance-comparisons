package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_196 {
    private final Production53_196 production = new Production53_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}