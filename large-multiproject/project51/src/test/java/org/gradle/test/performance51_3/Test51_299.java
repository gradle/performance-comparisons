package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_299 {
    private final Production51_299 production = new Production51_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}