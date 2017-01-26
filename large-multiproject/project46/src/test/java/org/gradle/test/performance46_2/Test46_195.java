package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_195 {
    private final Production46_195 production = new Production46_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}