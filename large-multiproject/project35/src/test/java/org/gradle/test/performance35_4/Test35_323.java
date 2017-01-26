package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_323 {
    private final Production35_323 production = new Production35_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}