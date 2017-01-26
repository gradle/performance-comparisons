package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_102 {
    private final Production44_102 production = new Production44_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}