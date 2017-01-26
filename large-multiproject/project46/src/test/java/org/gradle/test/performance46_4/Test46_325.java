package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_325 {
    private final Production46_325 production = new Production46_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}