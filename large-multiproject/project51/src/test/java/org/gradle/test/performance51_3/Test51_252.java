package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_252 {
    private final Production51_252 production = new Production51_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}