package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_310 {
    private final Production53_310 production = new Production53_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}