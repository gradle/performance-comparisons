package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_29 {
    private final Production71_29 production = new Production71_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}