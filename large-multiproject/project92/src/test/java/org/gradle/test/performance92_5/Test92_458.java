package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_458 {
    private final Production92_458 production = new Production92_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}