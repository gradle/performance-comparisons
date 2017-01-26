package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_104 {
    private final Production71_104 production = new Production71_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}