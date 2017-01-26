package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_361 {
    private final Production71_361 production = new Production71_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}