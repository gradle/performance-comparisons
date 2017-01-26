package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_246 {
    private final Production71_246 production = new Production71_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}