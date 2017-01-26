package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_183 {
    private final Production46_183 production = new Production46_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}