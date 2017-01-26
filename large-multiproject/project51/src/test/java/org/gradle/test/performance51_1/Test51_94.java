package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_94 {
    private final Production51_94 production = new Production51_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}