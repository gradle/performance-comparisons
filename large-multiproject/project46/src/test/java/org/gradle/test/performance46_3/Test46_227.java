package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_227 {
    private final Production46_227 production = new Production46_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}