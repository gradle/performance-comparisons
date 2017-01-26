package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_266 {
    private final Production71_266 production = new Production71_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}