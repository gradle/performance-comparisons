package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_474 {
    private final Production71_474 production = new Production71_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}