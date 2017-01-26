package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_110 {
    private final Production51_110 production = new Production51_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}