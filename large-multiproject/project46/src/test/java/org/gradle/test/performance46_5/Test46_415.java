package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_415 {
    private final Production46_415 production = new Production46_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}