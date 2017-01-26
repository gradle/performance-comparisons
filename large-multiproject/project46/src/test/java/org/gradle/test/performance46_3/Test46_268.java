package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_268 {
    private final Production46_268 production = new Production46_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}