package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_65 {
    private final Production1_65 production = new Production1_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}