package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_390 {
    private final Production35_390 production = new Production35_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}