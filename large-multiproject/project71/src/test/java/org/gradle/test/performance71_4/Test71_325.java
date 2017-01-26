package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_325 {
    private final Production71_325 production = new Production71_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}