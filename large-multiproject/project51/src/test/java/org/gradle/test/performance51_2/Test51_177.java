package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_177 {
    private final Production51_177 production = new Production51_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}