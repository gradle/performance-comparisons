package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_216 {
    private final Production71_216 production = new Production71_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}