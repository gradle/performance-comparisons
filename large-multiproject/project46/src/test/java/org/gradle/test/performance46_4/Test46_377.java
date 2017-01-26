package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_377 {
    private final Production46_377 production = new Production46_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}