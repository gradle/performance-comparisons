package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_57 {
    private final Production1_57 production = new Production1_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}