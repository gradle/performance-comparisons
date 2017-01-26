package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_44 {
    private final Production46_44 production = new Production46_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}