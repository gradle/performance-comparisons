package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_74 {
    private final Production71_74 production = new Production71_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}