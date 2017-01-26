package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_279 {
    private final Production51_279 production = new Production51_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}