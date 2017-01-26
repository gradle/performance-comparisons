package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_184 {
    private final Production51_184 production = new Production51_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}