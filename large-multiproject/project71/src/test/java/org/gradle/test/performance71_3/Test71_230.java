package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_230 {
    private final Production71_230 production = new Production71_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}