package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_90 {
    private final Production71_90 production = new Production71_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}