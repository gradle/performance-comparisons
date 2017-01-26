package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_230 {
    private final Production57_230 production = new Production57_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}