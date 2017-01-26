package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_186 {
    private final Production7_186 production = new Production7_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}