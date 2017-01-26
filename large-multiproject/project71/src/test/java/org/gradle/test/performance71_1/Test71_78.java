package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_78 {
    private final Production71_78 production = new Production71_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}