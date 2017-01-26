package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_63 {
    private final Production1_63 production = new Production1_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}