package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_402 {
    private final Production51_402 production = new Production51_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}