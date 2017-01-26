package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_424 {
    private final Production14_424 production = new Production14_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}