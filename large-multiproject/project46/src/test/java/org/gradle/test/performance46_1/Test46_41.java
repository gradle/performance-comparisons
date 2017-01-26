package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_41 {
    private final Production46_41 production = new Production46_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}