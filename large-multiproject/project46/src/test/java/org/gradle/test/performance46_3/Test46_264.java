package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_264 {
    private final Production46_264 production = new Production46_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}