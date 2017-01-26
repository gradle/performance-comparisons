package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_212 {
    private final Production46_212 production = new Production46_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}