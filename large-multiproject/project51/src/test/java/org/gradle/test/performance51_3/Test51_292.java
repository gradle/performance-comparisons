package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_292 {
    private final Production51_292 production = new Production51_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}