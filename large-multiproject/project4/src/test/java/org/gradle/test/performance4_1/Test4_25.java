package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_25 {
    private final Production4_25 production = new Production4_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}