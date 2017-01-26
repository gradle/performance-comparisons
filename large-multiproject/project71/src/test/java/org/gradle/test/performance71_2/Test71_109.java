package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_109 {
    private final Production71_109 production = new Production71_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}