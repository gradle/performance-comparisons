package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_293 {
    private final Production14_293 production = new Production14_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}