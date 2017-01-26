package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_58 {
    private final Production46_58 production = new Production46_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}