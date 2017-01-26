package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_251 {
    private final Production35_251 production = new Production35_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}