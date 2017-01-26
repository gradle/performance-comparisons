package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_171 {
    private final Production46_171 production = new Production46_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}