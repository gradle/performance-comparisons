package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_248 {
    private final Production19_248 production = new Production19_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}