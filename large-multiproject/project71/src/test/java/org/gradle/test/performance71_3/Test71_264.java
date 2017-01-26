package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_264 {
    private final Production71_264 production = new Production71_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}