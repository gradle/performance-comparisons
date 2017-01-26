package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_98 {
    private final Production46_98 production = new Production46_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}