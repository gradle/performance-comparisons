package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_11 {
    private final Production51_11 production = new Production51_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}