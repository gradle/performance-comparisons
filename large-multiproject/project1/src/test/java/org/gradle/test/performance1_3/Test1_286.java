package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_286 {
    private final Production1_286 production = new Production1_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}