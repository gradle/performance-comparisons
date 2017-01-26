package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_360 {
    private final Production14_360 production = new Production14_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}