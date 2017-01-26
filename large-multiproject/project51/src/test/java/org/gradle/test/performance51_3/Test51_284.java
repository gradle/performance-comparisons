package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_284 {
    private final Production51_284 production = new Production51_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}