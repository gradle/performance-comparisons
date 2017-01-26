package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_191 {
    private final Production1_191 production = new Production1_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}