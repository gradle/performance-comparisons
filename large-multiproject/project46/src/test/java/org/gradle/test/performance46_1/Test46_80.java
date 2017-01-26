package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_80 {
    private final Production46_80 production = new Production46_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}