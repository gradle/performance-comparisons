package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_138 {
    private final Production1_138 production = new Production1_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}