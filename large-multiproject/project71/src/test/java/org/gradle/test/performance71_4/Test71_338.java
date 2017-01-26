package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_338 {
    private final Production71_338 production = new Production71_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}