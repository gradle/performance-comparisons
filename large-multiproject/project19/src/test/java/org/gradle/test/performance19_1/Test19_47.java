package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_47 {
    private final Production19_47 production = new Production19_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}