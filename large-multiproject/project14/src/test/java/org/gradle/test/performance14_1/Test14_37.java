package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_37 {
    private final Production14_37 production = new Production14_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}