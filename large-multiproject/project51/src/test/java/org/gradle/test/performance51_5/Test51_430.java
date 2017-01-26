package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_430 {
    private final Production51_430 production = new Production51_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}