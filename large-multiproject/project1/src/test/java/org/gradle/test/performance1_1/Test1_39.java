package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_39 {
    private final Production1_39 production = new Production1_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}