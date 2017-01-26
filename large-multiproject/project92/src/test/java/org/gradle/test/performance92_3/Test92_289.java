package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_289 {
    private final Production92_289 production = new Production92_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}