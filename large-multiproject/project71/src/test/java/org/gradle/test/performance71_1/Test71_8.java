package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_8 {
    private final Production71_8 production = new Production71_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}