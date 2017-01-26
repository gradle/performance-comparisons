package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_79 {
    private final Production51_79 production = new Production51_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}