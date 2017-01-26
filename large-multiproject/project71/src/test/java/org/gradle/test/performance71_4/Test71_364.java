package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_364 {
    private final Production71_364 production = new Production71_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}