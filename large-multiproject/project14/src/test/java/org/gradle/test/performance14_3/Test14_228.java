package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_228 {
    private final Production14_228 production = new Production14_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}