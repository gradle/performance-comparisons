package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_322 {
    private final Production46_322 production = new Production46_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}