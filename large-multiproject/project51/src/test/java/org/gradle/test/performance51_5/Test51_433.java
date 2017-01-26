package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_433 {
    private final Production51_433 production = new Production51_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}