package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_119 {
    private final Production46_119 production = new Production46_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}