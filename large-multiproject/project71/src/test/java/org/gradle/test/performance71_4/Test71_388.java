package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_388 {
    private final Production71_388 production = new Production71_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}