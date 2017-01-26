package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_360 {
    private final Production1_360 production = new Production1_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}