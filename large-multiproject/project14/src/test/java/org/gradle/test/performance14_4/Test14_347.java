package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_347 {
    private final Production14_347 production = new Production14_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}