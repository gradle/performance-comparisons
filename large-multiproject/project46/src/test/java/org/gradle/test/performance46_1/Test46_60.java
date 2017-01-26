package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_60 {
    private final Production46_60 production = new Production46_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}