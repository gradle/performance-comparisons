package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_72 {
    private final Production46_72 production = new Production46_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}