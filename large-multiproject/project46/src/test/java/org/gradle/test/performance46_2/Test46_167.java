package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_167 {
    private final Production46_167 production = new Production46_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}