package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_465 {
    private final Production46_465 production = new Production46_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}