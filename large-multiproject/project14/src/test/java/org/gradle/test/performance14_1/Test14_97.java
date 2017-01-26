package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_97 {
    private final Production14_97 production = new Production14_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}