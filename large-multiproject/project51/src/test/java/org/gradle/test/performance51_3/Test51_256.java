package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_256 {
    private final Production51_256 production = new Production51_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}