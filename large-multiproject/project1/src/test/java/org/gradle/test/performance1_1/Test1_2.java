package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_2 {
    private final Production1_2 production = new Production1_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}