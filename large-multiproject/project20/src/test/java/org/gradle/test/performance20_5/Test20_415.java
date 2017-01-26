package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_415 {
    private final Production20_415 production = new Production20_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}