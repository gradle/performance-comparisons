package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_361 {
    private final Production46_361 production = new Production46_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}