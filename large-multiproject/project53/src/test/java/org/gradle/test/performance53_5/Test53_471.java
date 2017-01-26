package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_471 {
    private final Production53_471 production = new Production53_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}