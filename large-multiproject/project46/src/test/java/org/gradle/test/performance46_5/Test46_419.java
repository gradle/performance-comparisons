package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_419 {
    private final Production46_419 production = new Production46_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}