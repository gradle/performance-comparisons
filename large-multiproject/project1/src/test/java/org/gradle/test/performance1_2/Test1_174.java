package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_174 {
    private final Production1_174 production = new Production1_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}