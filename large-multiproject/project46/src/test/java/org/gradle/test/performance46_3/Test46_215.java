package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_215 {
    private final Production46_215 production = new Production46_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}