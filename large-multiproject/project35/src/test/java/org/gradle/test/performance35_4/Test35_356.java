package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_356 {
    private final Production35_356 production = new Production35_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}