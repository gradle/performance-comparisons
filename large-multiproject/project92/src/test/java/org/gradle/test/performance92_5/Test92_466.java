package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_466 {
    private final Production92_466 production = new Production92_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}