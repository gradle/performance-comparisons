package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_404 {
    private final Production57_404 production = new Production57_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}