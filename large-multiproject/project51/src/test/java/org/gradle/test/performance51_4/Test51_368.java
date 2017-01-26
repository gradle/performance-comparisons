package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_368 {
    private final Production51_368 production = new Production51_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}