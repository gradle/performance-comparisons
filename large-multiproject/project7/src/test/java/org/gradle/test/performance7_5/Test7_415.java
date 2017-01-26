package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_415 {
    private final Production7_415 production = new Production7_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}