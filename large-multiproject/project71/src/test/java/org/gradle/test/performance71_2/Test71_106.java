package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_106 {
    private final Production71_106 production = new Production71_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}