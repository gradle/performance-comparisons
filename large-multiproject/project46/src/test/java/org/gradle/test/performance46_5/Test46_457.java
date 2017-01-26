package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_457 {
    private final Production46_457 production = new Production46_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}