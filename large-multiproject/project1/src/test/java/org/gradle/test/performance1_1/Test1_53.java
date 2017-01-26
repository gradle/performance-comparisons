package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_53 {
    private final Production1_53 production = new Production1_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}