package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_320 {
    private final Production1_320 production = new Production1_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}