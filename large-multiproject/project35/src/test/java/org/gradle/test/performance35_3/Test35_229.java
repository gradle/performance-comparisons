package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_229 {
    private final Production35_229 production = new Production35_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}