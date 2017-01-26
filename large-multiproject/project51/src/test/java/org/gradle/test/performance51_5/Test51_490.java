package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_490 {
    private final Production51_490 production = new Production51_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}