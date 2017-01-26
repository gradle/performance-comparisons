package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_241 {
    private final Production92_241 production = new Production92_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}