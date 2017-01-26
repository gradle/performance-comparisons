package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_44 {
    private final Production92_44 production = new Production92_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}