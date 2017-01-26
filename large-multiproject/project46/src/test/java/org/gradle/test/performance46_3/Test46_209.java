package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_209 {
    private final Production46_209 production = new Production46_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}