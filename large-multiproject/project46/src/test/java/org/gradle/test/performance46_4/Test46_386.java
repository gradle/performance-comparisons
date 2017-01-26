package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_386 {
    private final Production46_386 production = new Production46_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}