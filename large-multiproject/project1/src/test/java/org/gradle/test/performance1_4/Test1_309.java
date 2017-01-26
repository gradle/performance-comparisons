package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_309 {
    private final Production1_309 production = new Production1_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}