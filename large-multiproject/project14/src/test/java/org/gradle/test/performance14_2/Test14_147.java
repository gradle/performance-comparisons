package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_147 {
    private final Production14_147 production = new Production14_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}