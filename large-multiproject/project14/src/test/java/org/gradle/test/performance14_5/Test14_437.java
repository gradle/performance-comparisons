package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_437 {
    private final Production14_437 production = new Production14_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}