package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_92 {
    private final Production19_92 production = new Production19_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}