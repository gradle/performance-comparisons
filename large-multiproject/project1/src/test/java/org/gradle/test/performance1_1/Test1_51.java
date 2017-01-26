package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_51 {
    private final Production1_51 production = new Production1_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}