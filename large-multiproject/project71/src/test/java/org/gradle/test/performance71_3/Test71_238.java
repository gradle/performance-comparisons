package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_238 {
    private final Production71_238 production = new Production71_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}