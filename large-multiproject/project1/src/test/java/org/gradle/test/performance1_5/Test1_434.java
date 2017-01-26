package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_434 {
    private final Production1_434 production = new Production1_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}