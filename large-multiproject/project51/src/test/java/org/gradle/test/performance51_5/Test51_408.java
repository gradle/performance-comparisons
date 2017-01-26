package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_408 {
    private final Production51_408 production = new Production51_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}