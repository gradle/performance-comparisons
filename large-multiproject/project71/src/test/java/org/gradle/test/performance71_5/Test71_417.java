package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_417 {
    private final Production71_417 production = new Production71_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}