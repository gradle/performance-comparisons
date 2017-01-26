package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_257 {
    private final Production57_257 production = new Production57_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}