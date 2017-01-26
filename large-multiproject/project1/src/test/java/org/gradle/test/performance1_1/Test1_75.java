package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_75 {
    private final Production1_75 production = new Production1_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}