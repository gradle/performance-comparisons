package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_415 {
    private final Production14_415 production = new Production14_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}