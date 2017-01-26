package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_229 {
    private final Production71_229 production = new Production71_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}