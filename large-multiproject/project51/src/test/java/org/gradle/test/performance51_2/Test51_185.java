package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_185 {
    private final Production51_185 production = new Production51_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}