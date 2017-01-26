package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_294 {
    private final Production57_294 production = new Production57_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}