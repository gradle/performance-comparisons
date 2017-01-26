package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_106 {
    private final Production92_106 production = new Production92_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}