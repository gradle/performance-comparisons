package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_220 {
    private final Production71_220 production = new Production71_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}