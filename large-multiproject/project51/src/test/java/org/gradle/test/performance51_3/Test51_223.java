package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_223 {
    private final Production51_223 production = new Production51_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}