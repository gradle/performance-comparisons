package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_14 {
    private final Production71_14 production = new Production71_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}