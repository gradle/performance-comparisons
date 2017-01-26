package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_407 {
    private final Production51_407 production = new Production51_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}