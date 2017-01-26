package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_102 {
    private final Production61_102 production = new Production61_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}