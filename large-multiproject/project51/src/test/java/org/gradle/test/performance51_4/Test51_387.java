package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_387 {
    private final Production51_387 production = new Production51_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}