package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_207 {
    private final Production13_207 production = new Production13_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}