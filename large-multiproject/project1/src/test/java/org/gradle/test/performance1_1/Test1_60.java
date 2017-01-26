package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_60 {
    private final Production1_60 production = new Production1_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}