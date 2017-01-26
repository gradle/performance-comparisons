package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_186 {
    private final Production19_186 production = new Production19_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}