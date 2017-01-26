package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_202 {
    private final Production46_202 production = new Production46_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}