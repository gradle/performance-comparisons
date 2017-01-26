package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_167 {
    private final Production71_167 production = new Production71_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}