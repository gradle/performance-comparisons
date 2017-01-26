package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_293 {
    private final Production46_293 production = new Production46_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}