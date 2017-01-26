package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_248 {
    private final Production51_248 production = new Production51_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}