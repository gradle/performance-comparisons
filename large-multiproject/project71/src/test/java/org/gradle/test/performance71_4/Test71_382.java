package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_382 {
    private final Production71_382 production = new Production71_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}