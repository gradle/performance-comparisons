package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_358 {
    private final Production71_358 production = new Production71_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}