package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_82 {
    private final Production71_82 production = new Production71_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}