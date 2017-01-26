package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_166 {
    private final Production57_166 production = new Production57_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}