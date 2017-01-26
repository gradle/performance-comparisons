package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_278 {
    private final Production51_278 production = new Production51_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}