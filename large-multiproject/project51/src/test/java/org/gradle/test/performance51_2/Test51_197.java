package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_197 {
    private final Production51_197 production = new Production51_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}