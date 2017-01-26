package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_29 {
    private final Production92_29 production = new Production92_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}