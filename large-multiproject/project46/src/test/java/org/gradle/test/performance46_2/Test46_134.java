package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_134 {
    private final Production46_134 production = new Production46_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}