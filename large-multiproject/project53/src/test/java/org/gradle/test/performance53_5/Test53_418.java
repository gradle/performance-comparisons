package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_418 {
    private final Production53_418 production = new Production53_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}