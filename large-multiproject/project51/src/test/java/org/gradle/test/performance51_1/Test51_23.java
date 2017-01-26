package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_23 {
    private final Production51_23 production = new Production51_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}