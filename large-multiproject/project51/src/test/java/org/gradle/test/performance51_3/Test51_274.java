package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_274 {
    private final Production51_274 production = new Production51_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}