package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_68 {
    private final Production71_68 production = new Production71_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}