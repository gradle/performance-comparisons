package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_150 {
    private final Production46_150 production = new Production46_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}