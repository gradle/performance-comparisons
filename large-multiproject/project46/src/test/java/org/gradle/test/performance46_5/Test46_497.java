package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_497 {
    private final Production46_497 production = new Production46_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}