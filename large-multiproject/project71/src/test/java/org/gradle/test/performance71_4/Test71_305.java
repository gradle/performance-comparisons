package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_305 {
    private final Production71_305 production = new Production71_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}