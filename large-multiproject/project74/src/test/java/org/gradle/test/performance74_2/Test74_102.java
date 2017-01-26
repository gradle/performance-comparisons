package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_102 {
    private final Production74_102 production = new Production74_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}