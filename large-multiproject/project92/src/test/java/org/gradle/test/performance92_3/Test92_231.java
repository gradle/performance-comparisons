package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_231 {
    private final Production92_231 production = new Production92_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}