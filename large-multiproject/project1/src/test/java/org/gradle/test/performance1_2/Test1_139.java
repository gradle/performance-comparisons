package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_139 {
    private final Production1_139 production = new Production1_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}