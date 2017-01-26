package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_117 {
    private final Production51_117 production = new Production51_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}