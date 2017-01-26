package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_97 {
    private final Production71_97 production = new Production71_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}