package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_15 {
    private final Production24_15 production = new Production24_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}