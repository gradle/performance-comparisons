package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_199 {
    private final Production71_199 production = new Production71_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}