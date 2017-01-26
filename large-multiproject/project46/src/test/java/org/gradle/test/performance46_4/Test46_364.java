package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_364 {
    private final Production46_364 production = new Production46_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}