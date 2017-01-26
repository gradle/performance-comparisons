package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_101 {
    private final Production51_101 production = new Production51_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}