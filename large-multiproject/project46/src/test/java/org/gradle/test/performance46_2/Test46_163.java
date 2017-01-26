package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_163 {
    private final Production46_163 production = new Production46_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}