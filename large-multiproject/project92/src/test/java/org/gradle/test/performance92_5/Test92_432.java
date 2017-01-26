package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_432 {
    private final Production92_432 production = new Production92_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}