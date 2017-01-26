package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_147 {
    private final Production92_147 production = new Production92_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}