package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_315 {
    private final Production14_315 production = new Production14_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}