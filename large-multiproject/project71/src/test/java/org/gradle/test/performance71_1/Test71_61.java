package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_61 {
    private final Production71_61 production = new Production71_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}