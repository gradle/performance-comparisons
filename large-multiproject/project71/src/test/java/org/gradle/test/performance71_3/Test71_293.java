package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_293 {
    private final Production71_293 production = new Production71_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}