package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_172 {
    private final Production46_172 production = new Production46_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}