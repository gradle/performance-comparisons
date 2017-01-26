package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_214 {
    private final Production71_214 production = new Production71_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}