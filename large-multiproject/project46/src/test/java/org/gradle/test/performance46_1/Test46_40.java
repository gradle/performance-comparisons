package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_40 {
    private final Production46_40 production = new Production46_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}