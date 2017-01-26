package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_92 {
    private final Production71_92 production = new Production71_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}