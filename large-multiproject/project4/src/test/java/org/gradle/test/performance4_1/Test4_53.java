package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_53 {
    private final Production4_53 production = new Production4_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}