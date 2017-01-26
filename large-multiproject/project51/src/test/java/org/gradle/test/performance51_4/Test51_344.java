package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_344 {
    private final Production51_344 production = new Production51_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}