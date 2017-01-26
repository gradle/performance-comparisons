package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_120 {
    private final Production51_120 production = new Production51_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}