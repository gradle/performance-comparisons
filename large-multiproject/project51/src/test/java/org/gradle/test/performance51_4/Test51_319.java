package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_319 {
    private final Production51_319 production = new Production51_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}