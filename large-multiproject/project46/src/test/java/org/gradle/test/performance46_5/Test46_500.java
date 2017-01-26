package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_500 {
    private final Production46_500 production = new Production46_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}