package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_240 {
    private final Production51_240 production = new Production51_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}