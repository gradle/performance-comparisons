package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_102 {
    private final Production20_102 production = new Production20_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}