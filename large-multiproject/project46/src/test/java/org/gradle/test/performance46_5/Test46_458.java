package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_458 {
    private final Production46_458 production = new Production46_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}