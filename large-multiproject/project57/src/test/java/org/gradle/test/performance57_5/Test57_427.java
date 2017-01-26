package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_427 {
    private final Production57_427 production = new Production57_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}