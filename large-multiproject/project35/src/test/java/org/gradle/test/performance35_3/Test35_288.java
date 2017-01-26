package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_288 {
    private final Production35_288 production = new Production35_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}