package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_375 {
    private final Production51_375 production = new Production51_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}