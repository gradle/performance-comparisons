package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_71 {
    private final Production46_71 production = new Production46_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}