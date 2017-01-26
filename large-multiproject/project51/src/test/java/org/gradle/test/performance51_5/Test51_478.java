package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_478 {
    private final Production51_478 production = new Production51_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}