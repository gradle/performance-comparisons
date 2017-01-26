package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_66 {
    private final Production46_66 production = new Production46_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}