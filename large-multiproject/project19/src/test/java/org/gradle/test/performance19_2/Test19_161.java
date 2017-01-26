package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_161 {
    private final Production19_161 production = new Production19_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}