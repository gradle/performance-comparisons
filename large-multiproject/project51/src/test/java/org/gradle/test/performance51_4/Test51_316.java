package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_316 {
    private final Production51_316 production = new Production51_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}