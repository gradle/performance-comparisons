package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_104 {
    private final Production46_104 production = new Production46_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}