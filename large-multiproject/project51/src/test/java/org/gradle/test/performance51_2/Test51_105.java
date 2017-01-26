package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_105 {
    private final Production51_105 production = new Production51_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}