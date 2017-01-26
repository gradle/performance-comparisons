package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_463 {
    private final Production51_463 production = new Production51_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}