package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_332 {
    private final Production51_332 production = new Production51_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}