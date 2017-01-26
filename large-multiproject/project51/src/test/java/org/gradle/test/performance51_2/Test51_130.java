package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_130 {
    private final Production51_130 production = new Production51_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}