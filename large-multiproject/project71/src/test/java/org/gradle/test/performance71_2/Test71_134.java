package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_134 {
    private final Production71_134 production = new Production71_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}