package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_102 {
    private final Production14_102 production = new Production14_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}