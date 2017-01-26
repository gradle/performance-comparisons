package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_157 {
    private final Production35_157 production = new Production35_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}