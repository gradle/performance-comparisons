package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_303 {
    private final Production53_303 production = new Production53_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}