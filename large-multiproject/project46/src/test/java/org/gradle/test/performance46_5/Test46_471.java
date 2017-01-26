package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_471 {
    private final Production46_471 production = new Production46_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}