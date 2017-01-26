package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_442 {
    private final Production92_442 production = new Production92_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}