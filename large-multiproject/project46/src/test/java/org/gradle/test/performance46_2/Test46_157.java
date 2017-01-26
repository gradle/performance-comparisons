package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_157 {
    private final Production46_157 production = new Production46_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}