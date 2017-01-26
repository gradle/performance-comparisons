package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_273 {
    private final Production51_273 production = new Production51_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}