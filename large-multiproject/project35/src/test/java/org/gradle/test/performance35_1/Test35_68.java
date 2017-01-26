package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_68 {
    private final Production35_68 production = new Production35_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}