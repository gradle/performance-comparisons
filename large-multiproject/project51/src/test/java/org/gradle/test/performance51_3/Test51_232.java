package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_232 {
    private final Production51_232 production = new Production51_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}