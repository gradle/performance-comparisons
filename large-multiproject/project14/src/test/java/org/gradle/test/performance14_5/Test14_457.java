package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_457 {
    private final Production14_457 production = new Production14_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}