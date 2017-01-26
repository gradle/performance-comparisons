package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_29 {
    private final Production14_29 production = new Production14_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}