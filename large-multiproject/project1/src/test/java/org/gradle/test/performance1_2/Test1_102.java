package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_102 {
    private final Production1_102 production = new Production1_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}