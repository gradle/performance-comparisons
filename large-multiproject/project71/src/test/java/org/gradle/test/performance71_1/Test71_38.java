package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_38 {
    private final Production71_38 production = new Production71_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}