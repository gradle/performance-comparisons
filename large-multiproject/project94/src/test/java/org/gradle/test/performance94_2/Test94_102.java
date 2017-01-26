package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_102 {
    private final Production94_102 production = new Production94_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}