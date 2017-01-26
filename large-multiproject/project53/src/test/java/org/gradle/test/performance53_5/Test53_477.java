package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_477 {
    private final Production53_477 production = new Production53_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}