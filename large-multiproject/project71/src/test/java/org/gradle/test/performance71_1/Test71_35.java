package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_35 {
    private final Production71_35 production = new Production71_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}