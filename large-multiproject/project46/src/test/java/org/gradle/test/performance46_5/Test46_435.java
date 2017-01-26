package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_435 {
    private final Production46_435 production = new Production46_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}