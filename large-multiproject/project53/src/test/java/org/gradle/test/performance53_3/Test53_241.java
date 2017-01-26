package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_241 {
    private final Production53_241 production = new Production53_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}