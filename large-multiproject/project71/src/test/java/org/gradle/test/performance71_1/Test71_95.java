package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_95 {
    private final Production71_95 production = new Production71_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}