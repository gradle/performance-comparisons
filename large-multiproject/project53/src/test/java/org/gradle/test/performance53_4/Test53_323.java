package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_323 {
    private final Production53_323 production = new Production53_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}