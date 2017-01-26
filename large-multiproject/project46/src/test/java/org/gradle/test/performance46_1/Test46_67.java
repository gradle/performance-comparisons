package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_67 {
    private final Production46_67 production = new Production46_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}