package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_72 {
    private final Production71_72 production = new Production71_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}