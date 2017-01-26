package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_29 {
    private final Production46_29 production = new Production46_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}