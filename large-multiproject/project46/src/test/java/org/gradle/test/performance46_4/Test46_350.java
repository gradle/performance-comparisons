package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_350 {
    private final Production46_350 production = new Production46_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}