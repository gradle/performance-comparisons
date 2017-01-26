package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_166 {
    private final Production35_166 production = new Production35_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}