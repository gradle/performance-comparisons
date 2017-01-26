package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_40 {
    private final Production35_40 production = new Production35_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}