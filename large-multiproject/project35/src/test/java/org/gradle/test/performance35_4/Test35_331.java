package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_331 {
    private final Production35_331 production = new Production35_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}