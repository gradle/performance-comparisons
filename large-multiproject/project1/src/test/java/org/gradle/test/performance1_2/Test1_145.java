package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_145 {
    private final Production1_145 production = new Production1_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}