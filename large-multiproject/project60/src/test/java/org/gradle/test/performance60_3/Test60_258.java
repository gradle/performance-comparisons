package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_258 {
    private final Production60_258 production = new Production60_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}