package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_225 {
    private final Production57_225 production = new Production57_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}