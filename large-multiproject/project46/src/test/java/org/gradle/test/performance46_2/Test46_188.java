package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_188 {
    private final Production46_188 production = new Production46_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}