package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_28 {
    private final Production1_28 production = new Production1_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}