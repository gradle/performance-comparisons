package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_253 {
    private final Production71_253 production = new Production71_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}