package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_376 {
    private final Production51_376 production = new Production51_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}