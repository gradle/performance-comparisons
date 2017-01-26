package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_415 {
    private final Production1_415 production = new Production1_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}