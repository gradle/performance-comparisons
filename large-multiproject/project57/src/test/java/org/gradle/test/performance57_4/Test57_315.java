package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_315 {
    private final Production57_315 production = new Production57_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}