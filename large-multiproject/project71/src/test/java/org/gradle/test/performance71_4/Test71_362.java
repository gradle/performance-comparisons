package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_362 {
    private final Production71_362 production = new Production71_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}