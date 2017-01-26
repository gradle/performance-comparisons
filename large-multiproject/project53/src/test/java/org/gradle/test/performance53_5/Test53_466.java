package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_466 {
    private final Production53_466 production = new Production53_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}