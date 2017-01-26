package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_9 {
    private final Production71_9 production = new Production71_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}