package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_419 {
    private final Production14_419 production = new Production14_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}