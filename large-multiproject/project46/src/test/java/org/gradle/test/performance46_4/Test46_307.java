package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_307 {
    private final Production46_307 production = new Production46_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}