package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_320 {
    private final Production53_320 production = new Production53_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}