package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_246 {
    private final Production53_246 production = new Production53_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}