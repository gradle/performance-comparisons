package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_474 {
    private final Production92_474 production = new Production92_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}