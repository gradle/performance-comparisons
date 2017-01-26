package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_442 {
    private final Production46_442 production = new Production46_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}