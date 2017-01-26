package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_102 {
    private final Production50_102 production = new Production50_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}