package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_173 {
    private final Production46_173 production = new Production46_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}