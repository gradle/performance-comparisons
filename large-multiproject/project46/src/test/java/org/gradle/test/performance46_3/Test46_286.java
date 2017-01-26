package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_286 {
    private final Production46_286 production = new Production46_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}