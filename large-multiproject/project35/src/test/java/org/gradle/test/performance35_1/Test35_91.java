package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_91 {
    private final Production35_91 production = new Production35_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}