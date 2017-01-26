package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_90 {
    private final Production14_90 production = new Production14_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}