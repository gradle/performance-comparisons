package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_42 {
    private final Production71_42 production = new Production71_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}