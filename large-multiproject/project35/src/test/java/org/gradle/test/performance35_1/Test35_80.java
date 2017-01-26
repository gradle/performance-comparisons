package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_80 {
    private final Production35_80 production = new Production35_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}