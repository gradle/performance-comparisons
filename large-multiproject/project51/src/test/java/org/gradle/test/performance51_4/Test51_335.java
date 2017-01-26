package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_335 {
    private final Production51_335 production = new Production51_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}