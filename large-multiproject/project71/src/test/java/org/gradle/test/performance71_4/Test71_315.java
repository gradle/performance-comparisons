package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_315 {
    private final Production71_315 production = new Production71_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}