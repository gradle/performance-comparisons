package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_122 {
    private final Production51_122 production = new Production51_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}