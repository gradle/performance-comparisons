package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_243 {
    private final Production1_243 production = new Production1_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}