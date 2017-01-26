package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_61 {
    private final Production1_61 production = new Production1_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}