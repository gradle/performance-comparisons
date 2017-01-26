package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_288 {
    private final Production57_288 production = new Production57_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}