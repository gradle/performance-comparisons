package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_138 {
    private final Production46_138 production = new Production46_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}