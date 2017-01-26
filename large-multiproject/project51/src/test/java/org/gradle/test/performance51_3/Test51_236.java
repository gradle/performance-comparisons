package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_236 {
    private final Production51_236 production = new Production51_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}