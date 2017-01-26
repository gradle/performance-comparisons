package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_500 {
    private final Production53_500 production = new Production53_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}