package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_49 {
    private final Production35_49 production = new Production35_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}