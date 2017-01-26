package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_329 {
    private final Production1_329 production = new Production1_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}