package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_132 {
    private final Production51_132 production = new Production51_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}