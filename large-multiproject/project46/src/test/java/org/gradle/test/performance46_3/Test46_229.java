package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_229 {
    private final Production46_229 production = new Production46_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}