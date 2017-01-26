package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_157 {
    private final Production71_157 production = new Production71_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}