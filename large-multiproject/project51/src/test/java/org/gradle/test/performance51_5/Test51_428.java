package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_428 {
    private final Production51_428 production = new Production51_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}