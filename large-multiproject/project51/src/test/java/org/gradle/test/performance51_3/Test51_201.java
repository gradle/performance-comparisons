package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_201 {
    private final Production51_201 production = new Production51_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}