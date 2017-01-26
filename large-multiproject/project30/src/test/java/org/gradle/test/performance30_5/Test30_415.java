package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_415 {
    private final Production30_415 production = new Production30_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}