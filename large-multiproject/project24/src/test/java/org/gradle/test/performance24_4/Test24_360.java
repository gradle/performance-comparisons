package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_360 {
    private final Production24_360 production = new Production24_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}