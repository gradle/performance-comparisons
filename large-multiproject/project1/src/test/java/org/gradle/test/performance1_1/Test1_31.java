package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_31 {
    private final Production1_31 production = new Production1_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}