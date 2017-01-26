package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_166 {
    private final Production71_166 production = new Production71_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}