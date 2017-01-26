package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_266 {
    private final Production46_266 production = new Production46_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}