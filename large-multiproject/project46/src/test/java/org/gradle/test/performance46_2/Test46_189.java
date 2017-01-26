package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_189 {
    private final Production46_189 production = new Production46_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}