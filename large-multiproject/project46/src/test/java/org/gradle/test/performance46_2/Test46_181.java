package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_181 {
    private final Production46_181 production = new Production46_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}