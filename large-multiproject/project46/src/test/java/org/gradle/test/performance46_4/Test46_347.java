package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_347 {
    private final Production46_347 production = new Production46_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}