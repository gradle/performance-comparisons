package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_203 {
    private final Production46_203 production = new Production46_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}