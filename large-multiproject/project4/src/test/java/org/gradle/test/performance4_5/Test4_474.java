package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_474 {
    private final Production4_474 production = new Production4_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}