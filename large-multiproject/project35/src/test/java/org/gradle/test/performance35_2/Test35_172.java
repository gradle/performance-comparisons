package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_172 {
    private final Production35_172 production = new Production35_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}