package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_109 {
    private final Production92_109 production = new Production92_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}