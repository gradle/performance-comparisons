package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_189 {
    private final Production71_189 production = new Production71_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}