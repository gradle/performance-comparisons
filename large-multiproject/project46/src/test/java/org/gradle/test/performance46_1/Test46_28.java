package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_28 {
    private final Production46_28 production = new Production46_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}