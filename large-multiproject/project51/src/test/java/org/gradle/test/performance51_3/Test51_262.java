package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_262 {
    private final Production51_262 production = new Production51_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}