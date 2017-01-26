package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_173 {
    private final Production71_173 production = new Production71_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}