package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_102 {
    private final Production9_102 production = new Production9_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}