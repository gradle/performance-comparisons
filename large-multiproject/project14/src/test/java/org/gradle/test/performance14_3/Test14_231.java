package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_231 {
    private final Production14_231 production = new Production14_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}