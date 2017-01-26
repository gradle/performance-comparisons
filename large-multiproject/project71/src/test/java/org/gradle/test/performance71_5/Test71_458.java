package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_458 {
    private final Production71_458 production = new Production71_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}