package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_56 {
    private final Production79_56 production = new Production79_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}