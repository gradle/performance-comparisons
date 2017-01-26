package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_107 {
    private final Production1_107 production = new Production1_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}