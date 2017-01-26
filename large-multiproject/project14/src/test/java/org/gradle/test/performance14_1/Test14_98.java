package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_98 {
    private final Production14_98 production = new Production14_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}