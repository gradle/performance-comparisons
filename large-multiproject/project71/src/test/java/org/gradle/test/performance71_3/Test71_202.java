package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_202 {
    private final Production71_202 production = new Production71_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}