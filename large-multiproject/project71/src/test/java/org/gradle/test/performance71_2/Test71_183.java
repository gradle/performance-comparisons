package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_183 {
    private final Production71_183 production = new Production71_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}