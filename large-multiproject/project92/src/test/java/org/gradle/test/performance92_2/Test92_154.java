package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_154 {
    private final Production92_154 production = new Production92_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}