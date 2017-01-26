package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_444 {
    private final Production71_444 production = new Production71_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}