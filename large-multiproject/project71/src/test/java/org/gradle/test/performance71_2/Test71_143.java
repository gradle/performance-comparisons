package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_143 {
    private final Production71_143 production = new Production71_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}