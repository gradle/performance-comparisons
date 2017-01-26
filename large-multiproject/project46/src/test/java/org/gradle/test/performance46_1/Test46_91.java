package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_91 {
    private final Production46_91 production = new Production46_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}