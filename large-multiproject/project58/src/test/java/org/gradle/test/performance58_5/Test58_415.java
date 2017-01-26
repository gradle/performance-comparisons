package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_415 {
    private final Production58_415 production = new Production58_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}