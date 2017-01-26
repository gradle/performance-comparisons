package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_126 {
    private final Production46_126 production = new Production46_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}