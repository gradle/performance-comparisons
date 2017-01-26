package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_60 {
    private final Production71_60 production = new Production71_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}