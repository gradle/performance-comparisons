package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_41 {
    private final Production71_41 production = new Production71_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}