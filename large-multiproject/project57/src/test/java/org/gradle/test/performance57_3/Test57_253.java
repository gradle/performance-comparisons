package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_253 {
    private final Production57_253 production = new Production57_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}