package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_188 {
    private final Production71_188 production = new Production71_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}