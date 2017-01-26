package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_326 {
    private final Production46_326 production = new Production46_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}