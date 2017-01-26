package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_309 {
    private final Production46_309 production = new Production46_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}