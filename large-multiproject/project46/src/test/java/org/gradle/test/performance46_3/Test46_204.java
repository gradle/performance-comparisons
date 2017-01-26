package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_204 {
    private final Production46_204 production = new Production46_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}