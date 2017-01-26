package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_50 {
    private final Production51_50 production = new Production51_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}