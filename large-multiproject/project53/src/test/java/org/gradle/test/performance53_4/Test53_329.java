package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_329 {
    private final Production53_329 production = new Production53_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}