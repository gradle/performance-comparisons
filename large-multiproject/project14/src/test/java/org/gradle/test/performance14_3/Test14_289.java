package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_289 {
    private final Production14_289 production = new Production14_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}