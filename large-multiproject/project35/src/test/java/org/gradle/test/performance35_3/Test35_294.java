package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_294 {
    private final Production35_294 production = new Production35_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}