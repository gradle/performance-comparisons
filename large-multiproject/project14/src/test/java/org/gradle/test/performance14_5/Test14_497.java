package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_497 {
    private final Production14_497 production = new Production14_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}