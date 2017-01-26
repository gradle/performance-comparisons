package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_75 {
    private final Production46_75 production = new Production46_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}