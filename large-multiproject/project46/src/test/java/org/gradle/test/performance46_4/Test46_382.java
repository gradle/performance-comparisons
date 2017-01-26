package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_382 {
    private final Production46_382 production = new Production46_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}