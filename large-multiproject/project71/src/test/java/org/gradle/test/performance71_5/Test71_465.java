package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_465 {
    private final Production71_465 production = new Production71_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}