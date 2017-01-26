package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_8 {
    private final Production1_8 production = new Production1_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}