package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_305 {
    private final Production46_305 production = new Production46_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}