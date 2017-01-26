package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_214 {
    private final Production57_214 production = new Production57_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}