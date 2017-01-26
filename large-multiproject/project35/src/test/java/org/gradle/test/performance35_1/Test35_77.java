package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_77 {
    private final Production35_77 production = new Production35_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}