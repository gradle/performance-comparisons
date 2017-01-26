package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_358 {
    private final Production46_358 production = new Production46_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}