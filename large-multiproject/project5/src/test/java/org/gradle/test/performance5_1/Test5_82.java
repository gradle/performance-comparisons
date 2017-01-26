package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_82 {
    private final Production5_82 production = new Production5_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}