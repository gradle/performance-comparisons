package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_320 {
    private final Production71_320 production = new Production71_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}