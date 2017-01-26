package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_330 {
    private final Production1_330 production = new Production1_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}