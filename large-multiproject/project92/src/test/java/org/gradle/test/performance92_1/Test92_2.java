package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_2 {
    private final Production92_2 production = new Production92_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}