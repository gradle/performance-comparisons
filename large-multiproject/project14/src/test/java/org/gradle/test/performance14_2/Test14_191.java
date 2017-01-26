package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_191 {
    private final Production14_191 production = new Production14_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}