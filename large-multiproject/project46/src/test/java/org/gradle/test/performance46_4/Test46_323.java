package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_323 {
    private final Production46_323 production = new Production46_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}