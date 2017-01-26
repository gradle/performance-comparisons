package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_350 {
    private final Production71_350 production = new Production71_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}