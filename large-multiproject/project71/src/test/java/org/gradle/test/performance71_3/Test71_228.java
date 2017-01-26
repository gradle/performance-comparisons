package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_228 {
    private final Production71_228 production = new Production71_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}