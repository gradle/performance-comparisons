package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_172 {
    private final Production71_172 production = new Production71_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}