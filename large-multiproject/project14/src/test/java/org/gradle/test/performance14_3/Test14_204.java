package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_204 {
    private final Production14_204 production = new Production14_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}