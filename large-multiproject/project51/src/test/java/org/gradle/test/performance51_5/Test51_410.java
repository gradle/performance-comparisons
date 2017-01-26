package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_410 {
    private final Production51_410 production = new Production51_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}