package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_76 {
    private final Production71_76 production = new Production71_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}