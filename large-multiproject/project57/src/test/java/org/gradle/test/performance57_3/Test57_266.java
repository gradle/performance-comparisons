package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_266 {
    private final Production57_266 production = new Production57_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}