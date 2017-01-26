package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_320 {
    private final Production24_320 production = new Production24_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}