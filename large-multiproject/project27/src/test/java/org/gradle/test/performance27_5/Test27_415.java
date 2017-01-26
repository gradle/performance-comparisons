package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_415 {
    private final Production27_415 production = new Production27_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}