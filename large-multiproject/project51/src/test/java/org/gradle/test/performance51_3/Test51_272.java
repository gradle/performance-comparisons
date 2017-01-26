package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_272 {
    private final Production51_272 production = new Production51_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}