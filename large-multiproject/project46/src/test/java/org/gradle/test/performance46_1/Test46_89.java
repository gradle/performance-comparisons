package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_89 {
    private final Production46_89 production = new Production46_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}