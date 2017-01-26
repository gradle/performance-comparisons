package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_32 {
    private final Production51_32 production = new Production51_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}