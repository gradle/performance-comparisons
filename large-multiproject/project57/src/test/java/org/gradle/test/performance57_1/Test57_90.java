package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_90 {
    private final Production57_90 production = new Production57_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}