package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_415 {
    private final Production15_415 production = new Production15_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}