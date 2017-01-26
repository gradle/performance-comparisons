package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_124 {
    private final Production51_124 production = new Production51_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}