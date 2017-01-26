package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_22 {
    private final Production51_22 production = new Production51_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}