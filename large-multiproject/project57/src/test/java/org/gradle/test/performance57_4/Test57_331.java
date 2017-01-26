package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_331 {
    private final Production57_331 production = new Production57_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}