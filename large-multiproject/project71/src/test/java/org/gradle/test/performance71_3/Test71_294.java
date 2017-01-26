package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_294 {
    private final Production71_294 production = new Production71_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}