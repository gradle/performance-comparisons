package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_25 {
    private final Production1_25 production = new Production1_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}