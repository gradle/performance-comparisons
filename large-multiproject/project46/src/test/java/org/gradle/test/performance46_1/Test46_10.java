package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_10 {
    private final Production46_10 production = new Production46_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}