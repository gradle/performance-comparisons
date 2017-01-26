package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_457 {
    private final Production71_457 production = new Production71_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}