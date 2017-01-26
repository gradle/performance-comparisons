package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_102 {
    private final Production10_102 production = new Production10_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}