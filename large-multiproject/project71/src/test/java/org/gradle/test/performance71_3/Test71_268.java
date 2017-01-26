package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_268 {
    private final Production71_268 production = new Production71_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}