package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_102 {
    private final Production18_102 production = new Production18_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}