package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_415 {
    private final Production99_415 production = new Production99_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}