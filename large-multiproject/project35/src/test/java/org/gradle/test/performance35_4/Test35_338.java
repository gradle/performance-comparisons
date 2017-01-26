package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_338 {
    private final Production35_338 production = new Production35_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}