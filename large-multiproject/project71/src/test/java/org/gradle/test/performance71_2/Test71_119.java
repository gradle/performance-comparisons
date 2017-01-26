package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_119 {
    private final Production71_119 production = new Production71_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}