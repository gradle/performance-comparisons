package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_270 {
    private final Production46_270 production = new Production46_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}