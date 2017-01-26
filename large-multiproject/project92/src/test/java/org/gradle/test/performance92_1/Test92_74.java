package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_74 {
    private final Production92_74 production = new Production92_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}