package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_447 {
    private final Production20_447 production = new Production20_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}