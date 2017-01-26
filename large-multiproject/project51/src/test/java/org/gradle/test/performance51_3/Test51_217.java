package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_217 {
    private final Production51_217 production = new Production51_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}