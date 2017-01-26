package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_250 {
    private final Production51_250 production = new Production51_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}