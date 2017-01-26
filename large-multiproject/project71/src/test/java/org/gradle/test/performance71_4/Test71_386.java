package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_386 {
    private final Production71_386 production = new Production71_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}