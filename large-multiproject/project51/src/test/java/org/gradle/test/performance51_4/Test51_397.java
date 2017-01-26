package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_397 {
    private final Production51_397 production = new Production51_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}