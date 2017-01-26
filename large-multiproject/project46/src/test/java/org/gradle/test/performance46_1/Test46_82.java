package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_82 {
    private final Production46_82 production = new Production46_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}