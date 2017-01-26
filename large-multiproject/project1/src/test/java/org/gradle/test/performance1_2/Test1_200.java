package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_200 {
    private final Production1_200 production = new Production1_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}