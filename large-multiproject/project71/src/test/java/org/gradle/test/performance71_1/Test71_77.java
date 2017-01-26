package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_77 {
    private final Production71_77 production = new Production71_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}