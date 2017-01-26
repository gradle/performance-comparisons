package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_72 {
    private final Production35_72 production = new Production35_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}