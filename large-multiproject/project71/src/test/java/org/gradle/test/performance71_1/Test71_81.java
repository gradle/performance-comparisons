package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_81 {
    private final Production71_81 production = new Production71_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}