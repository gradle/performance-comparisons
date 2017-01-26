package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_51 {
    private final Production92_51 production = new Production92_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}