package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_56 {
    private final Production51_56 production = new Production51_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}