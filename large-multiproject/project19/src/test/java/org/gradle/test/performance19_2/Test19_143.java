package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_143 {
    private final Production19_143 production = new Production19_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}