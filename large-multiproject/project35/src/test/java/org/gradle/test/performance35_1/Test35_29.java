package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_29 {
    private final Production35_29 production = new Production35_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}