package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_259 {
    private final Production71_259 production = new Production71_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}