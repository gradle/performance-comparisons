package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_154 {
    private final Production46_154 production = new Production46_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}