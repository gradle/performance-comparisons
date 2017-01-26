package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_337 {
    private final Production53_337 production = new Production53_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}