package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_330 {
    private final Production46_330 production = new Production46_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}