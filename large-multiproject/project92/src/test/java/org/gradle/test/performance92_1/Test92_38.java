package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_38 {
    private final Production92_38 production = new Production92_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}