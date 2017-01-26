package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_46 {
    private final Production1_46 production = new Production1_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}