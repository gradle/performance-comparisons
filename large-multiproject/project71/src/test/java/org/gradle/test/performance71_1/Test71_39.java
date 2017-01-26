package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_39 {
    private final Production71_39 production = new Production71_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}