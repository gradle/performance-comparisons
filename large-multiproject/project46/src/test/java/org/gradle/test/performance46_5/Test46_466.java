package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_466 {
    private final Production46_466 production = new Production46_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}