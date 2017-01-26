package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_445 {
    private final Production57_445 production = new Production57_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}