package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_37 {
    private final Production19_37 production = new Production19_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}