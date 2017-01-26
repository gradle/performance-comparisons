package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_235 {
    private final Production14_235 production = new Production14_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}