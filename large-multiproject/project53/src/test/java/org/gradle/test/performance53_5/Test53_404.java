package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_404 {
    private final Production53_404 production = new Production53_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}