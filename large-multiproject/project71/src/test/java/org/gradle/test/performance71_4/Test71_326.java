package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_326 {
    private final Production71_326 production = new Production71_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}