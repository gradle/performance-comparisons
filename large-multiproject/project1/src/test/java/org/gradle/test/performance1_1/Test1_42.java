package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_42 {
    private final Production1_42 production = new Production1_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}