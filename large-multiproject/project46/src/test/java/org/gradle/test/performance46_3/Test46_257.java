package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_257 {
    private final Production46_257 production = new Production46_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}