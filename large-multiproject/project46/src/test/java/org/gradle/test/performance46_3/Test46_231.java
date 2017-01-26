package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_231 {
    private final Production46_231 production = new Production46_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}