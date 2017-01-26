package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_394 {
    private final Production51_394 production = new Production51_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}