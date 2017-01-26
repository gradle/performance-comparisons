package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_327 {
    private final Production51_327 production = new Production51_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}