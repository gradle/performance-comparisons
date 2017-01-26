package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_495 {
    private final Production71_495 production = new Production71_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}