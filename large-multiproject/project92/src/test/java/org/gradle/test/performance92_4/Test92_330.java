package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_330 {
    private final Production92_330 production = new Production92_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}