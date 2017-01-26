package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_15 {
    private final Production14_15 production = new Production14_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}