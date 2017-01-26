package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_301 {
    private final Production51_301 production = new Production51_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}