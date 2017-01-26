package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_25 {
    private final Production46_25 production = new Production46_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}