package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_300 {
    private final Production71_300 production = new Production71_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}