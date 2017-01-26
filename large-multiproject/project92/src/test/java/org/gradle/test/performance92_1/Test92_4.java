package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_4 {
    private final Production92_4 production = new Production92_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}