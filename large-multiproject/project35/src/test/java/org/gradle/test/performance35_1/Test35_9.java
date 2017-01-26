package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_9 {
    private final Production35_9 production = new Production35_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}