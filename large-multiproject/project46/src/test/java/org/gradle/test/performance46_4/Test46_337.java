package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_337 {
    private final Production46_337 production = new Production46_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}