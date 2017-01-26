package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_465 {
    private final Production92_465 production = new Production92_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}