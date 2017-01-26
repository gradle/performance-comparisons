package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_307 {
    private final Production57_307 production = new Production57_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}