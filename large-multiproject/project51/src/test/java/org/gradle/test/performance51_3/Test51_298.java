package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_298 {
    private final Production51_298 production = new Production51_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}