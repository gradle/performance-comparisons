package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_101 {
    private final Production19_101 production = new Production19_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}