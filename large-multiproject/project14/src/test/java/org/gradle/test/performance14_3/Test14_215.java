package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_215 {
    private final Production14_215 production = new Production14_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}