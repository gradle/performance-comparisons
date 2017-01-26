package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_267 {
    private final Production71_267 production = new Production71_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}