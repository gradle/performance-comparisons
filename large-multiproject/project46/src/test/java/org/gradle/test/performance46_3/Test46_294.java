package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_294 {
    private final Production46_294 production = new Production46_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}