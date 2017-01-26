package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_227 {
    private final Production71_227 production = new Production71_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}