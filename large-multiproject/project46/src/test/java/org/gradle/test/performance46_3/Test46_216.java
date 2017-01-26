package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_216 {
    private final Production46_216 production = new Production46_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}