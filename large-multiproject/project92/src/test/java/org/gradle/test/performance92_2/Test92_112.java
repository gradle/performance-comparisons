package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_112 {
    private final Production92_112 production = new Production92_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}