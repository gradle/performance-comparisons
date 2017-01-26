package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_473 {
    private final Production51_473 production = new Production51_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}