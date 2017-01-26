package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_302 {
    private final Production24_302 production = new Production24_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}