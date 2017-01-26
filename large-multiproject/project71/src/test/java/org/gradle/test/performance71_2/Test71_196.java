package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_196 {
    private final Production71_196 production = new Production71_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}