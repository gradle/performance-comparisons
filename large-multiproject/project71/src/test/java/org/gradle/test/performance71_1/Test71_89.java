package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_89 {
    private final Production71_89 production = new Production71_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}