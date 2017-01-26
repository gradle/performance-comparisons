package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_398 {
    private final Production71_398 production = new Production71_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}