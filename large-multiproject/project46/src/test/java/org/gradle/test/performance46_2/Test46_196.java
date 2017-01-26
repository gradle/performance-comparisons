package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_196 {
    private final Production46_196 production = new Production46_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}