package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_66 {
    private final Production1_66 production = new Production1_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}