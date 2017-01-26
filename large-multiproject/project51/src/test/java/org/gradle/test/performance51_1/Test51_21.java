package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_21 {
    private final Production51_21 production = new Production51_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}