package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_6 {
    private final Production4_6 production = new Production4_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}