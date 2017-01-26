package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_102 {
    private final Production69_102 production = new Production69_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}