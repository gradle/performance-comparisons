package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_153 {
    private final Production51_153 production = new Production51_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}