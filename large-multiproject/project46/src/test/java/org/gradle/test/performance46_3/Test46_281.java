package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_281 {
    private final Production46_281 production = new Production46_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}