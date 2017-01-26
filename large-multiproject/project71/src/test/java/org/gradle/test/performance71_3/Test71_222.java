package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_222 {
    private final Production71_222 production = new Production71_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}