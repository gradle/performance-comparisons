package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_102 {
    private final Production43_102 production = new Production43_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}