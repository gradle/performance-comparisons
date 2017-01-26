package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_106 {
    private final Production46_106 production = new Production46_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}