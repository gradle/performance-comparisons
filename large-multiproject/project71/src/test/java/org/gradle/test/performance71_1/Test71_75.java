package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_75 {
    private final Production71_75 production = new Production71_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}