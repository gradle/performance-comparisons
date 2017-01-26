package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_196 {
    private final Production92_196 production = new Production92_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}