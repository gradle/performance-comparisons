package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_303 {
    private final Production46_303 production = new Production46_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}