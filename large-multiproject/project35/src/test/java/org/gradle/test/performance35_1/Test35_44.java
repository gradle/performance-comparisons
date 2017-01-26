package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_44 {
    private final Production35_44 production = new Production35_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}