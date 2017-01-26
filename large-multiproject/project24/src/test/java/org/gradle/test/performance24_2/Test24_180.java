package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_180 {
    private final Production24_180 production = new Production24_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}