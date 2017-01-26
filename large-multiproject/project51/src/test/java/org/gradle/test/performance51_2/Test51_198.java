package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_198 {
    private final Production51_198 production = new Production51_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}