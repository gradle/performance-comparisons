package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_493 {
    private final Production51_493 production = new Production51_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}