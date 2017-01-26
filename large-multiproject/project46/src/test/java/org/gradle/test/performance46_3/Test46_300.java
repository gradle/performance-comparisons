package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_300 {
    private final Production46_300 production = new Production46_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}