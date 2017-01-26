package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_338 {
    private final Production46_338 production = new Production46_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}