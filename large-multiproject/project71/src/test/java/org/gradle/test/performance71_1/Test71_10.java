package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_10 {
    private final Production71_10 production = new Production71_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}