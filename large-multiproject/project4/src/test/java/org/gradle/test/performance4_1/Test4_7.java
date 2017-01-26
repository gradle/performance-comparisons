package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_7 {
    private final Production4_7 production = new Production4_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}