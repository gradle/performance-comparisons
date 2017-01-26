package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_142 {
    private final Production24_142 production = new Production24_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}