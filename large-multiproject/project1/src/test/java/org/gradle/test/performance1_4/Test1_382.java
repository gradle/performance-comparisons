package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_382 {
    private final Production1_382 production = new Production1_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}