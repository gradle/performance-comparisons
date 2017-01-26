package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_93 {
    private final Production57_93 production = new Production57_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}