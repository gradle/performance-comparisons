package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_415 {
    private final Production90_415 production = new Production90_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}