package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_141 {
    private final Production51_141 production = new Production51_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}