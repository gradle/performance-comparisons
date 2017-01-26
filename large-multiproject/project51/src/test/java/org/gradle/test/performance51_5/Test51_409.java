package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_409 {
    private final Production51_409 production = new Production51_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}