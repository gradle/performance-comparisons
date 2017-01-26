package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_88 {
    private final Production71_88 production = new Production71_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}