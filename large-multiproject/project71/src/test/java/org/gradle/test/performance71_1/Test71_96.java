package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_96 {
    private final Production71_96 production = new Production71_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}