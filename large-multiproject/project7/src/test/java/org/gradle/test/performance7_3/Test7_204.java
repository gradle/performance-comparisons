package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_204 {
    private final Production7_204 production = new Production7_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}