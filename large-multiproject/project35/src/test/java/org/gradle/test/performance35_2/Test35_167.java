package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_167 {
    private final Production35_167 production = new Production35_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}