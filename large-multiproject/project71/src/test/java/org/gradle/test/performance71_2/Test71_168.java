package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_168 {
    private final Production71_168 production = new Production71_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}