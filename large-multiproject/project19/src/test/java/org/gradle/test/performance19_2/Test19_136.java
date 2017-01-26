package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_136 {
    private final Production19_136 production = new Production19_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}