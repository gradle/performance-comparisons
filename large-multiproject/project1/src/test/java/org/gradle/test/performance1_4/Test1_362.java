package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_362 {
    private final Production1_362 production = new Production1_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}