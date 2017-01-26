package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_260 {
    private final Production1_260 production = new Production1_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}