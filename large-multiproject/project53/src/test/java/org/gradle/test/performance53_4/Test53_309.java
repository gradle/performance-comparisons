package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_309 {
    private final Production53_309 production = new Production53_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}