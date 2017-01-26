package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_104 {
    private final Production1_104 production = new Production1_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}