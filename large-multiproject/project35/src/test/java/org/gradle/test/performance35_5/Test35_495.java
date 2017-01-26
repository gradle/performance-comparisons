package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_495 {
    private final Production35_495 production = new Production35_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}