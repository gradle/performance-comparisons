package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_359 {
    private final Production51_359 production = new Production51_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}