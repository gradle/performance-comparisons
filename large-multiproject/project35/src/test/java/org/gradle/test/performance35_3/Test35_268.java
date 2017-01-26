package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_268 {
    private final Production35_268 production = new Production35_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}