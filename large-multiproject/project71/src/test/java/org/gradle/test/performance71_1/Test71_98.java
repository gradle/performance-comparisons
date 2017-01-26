package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_98 {
    private final Production71_98 production = new Production71_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}