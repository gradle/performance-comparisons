package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_207 {
    private final Production35_207 production = new Production35_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}