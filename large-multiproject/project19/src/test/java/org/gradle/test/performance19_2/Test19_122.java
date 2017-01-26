package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_122 {
    private final Production19_122 production = new Production19_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}