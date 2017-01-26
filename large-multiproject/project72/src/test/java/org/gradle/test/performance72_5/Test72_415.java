package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_415 {
    private final Production72_415 production = new Production72_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}