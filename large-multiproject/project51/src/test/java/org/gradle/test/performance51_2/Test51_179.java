package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_179 {
    private final Production51_179 production = new Production51_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}