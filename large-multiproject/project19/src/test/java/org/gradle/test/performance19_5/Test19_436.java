package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_436 {
    private final Production19_436 production = new Production19_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}