package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_260 {
    private final Production46_260 production = new Production46_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}