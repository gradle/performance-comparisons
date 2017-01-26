package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_13 {
    private final Production51_13 production = new Production51_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}