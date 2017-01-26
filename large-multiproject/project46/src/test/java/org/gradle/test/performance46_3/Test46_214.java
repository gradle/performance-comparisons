package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_214 {
    private final Production46_214 production = new Production46_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}