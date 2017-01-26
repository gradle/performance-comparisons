package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_89 {
    private final Production35_89 production = new Production35_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}