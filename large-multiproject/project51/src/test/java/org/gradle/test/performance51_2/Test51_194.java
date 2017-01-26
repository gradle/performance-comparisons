package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_194 {
    private final Production51_194 production = new Production51_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}