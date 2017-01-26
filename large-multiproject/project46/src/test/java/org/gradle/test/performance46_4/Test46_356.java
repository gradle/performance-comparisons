package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_356 {
    private final Production46_356 production = new Production46_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}