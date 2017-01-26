package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_75 {
    private final Production35_75 production = new Production35_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}