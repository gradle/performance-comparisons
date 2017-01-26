package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_1 {
    private final Production19_1 production = new Production19_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}