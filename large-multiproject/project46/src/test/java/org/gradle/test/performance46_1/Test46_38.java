package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_38 {
    private final Production46_38 production = new Production46_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}