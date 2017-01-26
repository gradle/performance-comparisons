package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_477 {
    private final Production46_477 production = new Production46_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}