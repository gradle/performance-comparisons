package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_337 {
    private final Production92_337 production = new Production92_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}