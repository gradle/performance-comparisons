package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_337 {
    private final Production14_337 production = new Production14_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}