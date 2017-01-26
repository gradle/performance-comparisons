package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_210 {
    private final Production46_210 production = new Production46_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}