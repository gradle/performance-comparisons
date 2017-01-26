package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_102 {
    private final Production37_102 production = new Production37_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}