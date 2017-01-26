package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_258 {
    private final Production15_258 production = new Production15_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}