package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_118 {
    private final Production51_118 production = new Production51_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}